import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int friendsLength = friends.length;  // 친구의 수 
        HashMap<String, Integer> dic = new HashMap<>();  // 친구 이름과 인덱스 매핑
        int[] giftDegree = new int[friendsLength];  // 선물 받은 횟수
        int[][] giftGraph = new int[friendsLength][friendsLength];  // 친구들 간의 선물관계
        
        // 친구 이름을 해시맵에 넣어 인덱스와 매핑
        for(int i=0; i<friendsLength; i++) {
            dic.put(friends[i], i);
        }
        
         // 선물 정보를 이용하여 선물 관계와 선물 받은 횟수를 기록
         for ( String gift : gifts ) {
            String[] giftName = gift.split(" "); // 선물 정보를 공백을 기준으로 나누어 선물을 보낸 친구와 받은 친구를 구분
            giftDegree[dic.get(giftName[0])]++; // 선물 받은 횟수 증가
            giftDegree[dic.get(giftName[1])]--;  // 선물을 받은 친구의 선물 받은 횟수 감소
            giftGraph[dic.get(giftName[0])][dic.get(giftName[1])]++; // 선물을 보낸 친구와 받은 친구 사이의 관계 기록
        }
        
        // 각 친구들의 선물 관계를 비교하여 선물 지수 계산
        for(int i=0; i<friendsLength; i++) {
            int num = 0;  // 선물 지수 초기화
            for(int j=0; j<friendsLength; j++){
                if(i == j) {   // 만약 두 사람의 선물 지수가 같다면 건너 뛰기
                    continue;
                }
                
                // 선물을 보낸 친구가 받은 친구보다 더 많은 선물을 받았거나
                // 선물을 보낸 친구와 받은 친구가 같은 수의 선물을 받았지만 보낸 선물의 수가 더 많은 경우
                if(giftGraph[i][j] > giftGraph[j][i] ||
                    (giftGraph[i][j] == giftGraph[j][i] && giftDegree[i] > giftDegree[j])) {
                    num++;  // 선물 지수 증가
                }
            }
            
            if(answer < num) {
                answer = num;   // 최대 선호도 갱신
            }
        }
        
        
        return answer;
    }
}