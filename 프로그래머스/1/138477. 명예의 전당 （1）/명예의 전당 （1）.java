import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        // 상위 k번째 이내 -> 명예의 전당
        // 명예의 전당 목록의 점수의 개수 k
        // 1일~마지막 날 출연한 가수들의 점수 score
        // 매일 발표된 명예의 전당의 최하위 점수?
        // 기존 k번째 순위의 점수 > 새로운 점수 = 최하위 점수 그대로
        // 기존 k번째 순위의 점수 < 새로운 점수 = 새로운 점수가 최하위 점수로 변환
        
        int[] answer = new int[score.length];  // 결과 배열의 길이를 score 길이로 지정
        ArrayList<Integer> list = new ArrayList<>();  // 명예의 전당
        
        // score 순회
        for(int i=0; i<score.length; i++){    
           list.add(score[i]);   // list에 score값 하나씩 추가
            Collections.sort(list);  // ArrayList 오름차순 정렬
            
            if(i>=k) list.remove(0);  // i와 k가 같아지는 지점부터 명예의 전당에서 가장 작은 점수 삭제
            
            answer[i] = list.get(0);  // 결과에 ArrayList의 가장 작은 점수를 담는다.
        }       
        
        return answer;
    }
}