import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int count = 0;   // 갯수
        int idx = 0;     // answer의 인덱스
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                count++;   // 갯수 증가
            }
        }
        
        if(count == 0) {
            int[] answer = {-1};
            return answer;    // 로컬 변수이기 때문에 여기서 리턴
        }
        
        int[] answer = new int[count];  // count 크기만큼 answer 배열 생성
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[idx] = arr[i];
                idx++;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}