import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int noclear=0;   // 해당 스테이지를 클리어하지 못한 사용자 수
        int player=stages.length;   // 초기 전체 사용자 수 
        Map<Integer, Double> stagefail = new HashMap<Integer, Double>(); // key:스테이지 번호, value:실패율

        // 실패율 구하기
        // 각 스테이지의 실패율을 계산. i : 현재 스테이지 번호
        for(int i=1; i<=N; i++){   
            // stages 배열을 순회하며 각 사용자가 도전한 스테이지를 확인
            for(int s : stages){
                if(s==i) noclear++;
            }
            // 현재 스테이지에 도전한 사용자가 없는 경우 -> 실패율은 0.0
            if(player==0) {
                stagefail.put(i,0.0);
            } else {
                stagefail.put(i,(double)noclear/player); // 그렇지 않으면 실패율 계산 후 저장
                player -= noclear;   // 남은 전체 사용자 갱신해주기 = (전체 사용자 수 - 실패한 사용자 수)
                noclear = 0;   // 실패한 사용자 수 초기화
            }
        }

        // 실패율을 기준으로 정렬하기
        // Map.Entry 리스트 작성
        // list_entries는 각 엔트리가 실패율을 저장한 Map.Entry<Integer, Double> 객체들을 저장
        List<Map.Entry<Integer, Double>> list_entries = new ArrayList<Map.Entry<Integer, Double>>(stagefail.entrySet());
        
        // key 오름차순, value로 내림차순정렬
        // 비교함수 Comparator를 사용하여 오름차순으로 정렬
        Collections.sort(list_entries, new Comparator<Map.Entry<Integer, Double>>() {
            // compare로 값을 비교
            public int compare(Map.Entry<Integer, Double> obj1, Map.Entry<Integer, Double> obj2) {
                // 실패율을 기준으로 내림차순 정렬
                return obj2.getValue().compareTo(obj1.getValue()); // obj1이 obj2보다 크면 1, 같으면 0, 작으면 -1 반환
            }
        });

        int c=0;
        for(Map.Entry<Integer, Double> entry : list_entries) {
            answer[c]=entry.getKey(); c++; // 정렬한 list key값 answer에 넣기
        }
        return answer;
    }
}