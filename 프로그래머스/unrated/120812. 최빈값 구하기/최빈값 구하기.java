import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
       Arrays.sort(array);  // 배열을 오름차순으로 정렬
        
       int mode = -1;  // 최빈값 초기화
       int maxFrequency = 0;  // 최빈값의 빈도수 초기화
       
       int currentNum = array[0];  // 현재 숫자 초기화
       int currentFrequency = 1;  // 현재 숫자의 빈도수 초기화
        
        for(int i=1; i<array.length; i++){
            if(array[i] == currentNum){
                currentFrequency++;  // 만약 현재 숫자와 같다면 빈도수 증가
            } else {  // 현재 숫자와 다른 경우
                if(currentFrequency > maxFrequency) { // 현재 숫자의 빈도수가 최빈값의 빈도수보다 크면
                    mode = currentNum;  // 최빈값을 현재 숫자로 업데이트
                    maxFrequency = currentFrequency;  // 최빈값의 빈도수도 현재 숫자의 빈도수로 업데이트
                } else if (currentFrequency == maxFrequency) {
                    // 최빈값이 여러 개인 경우
                    mode = -1;
                }
            
            currentNum = array[i];
            currentFrequency = 1;
            }
        }
            
        
        // 최종 처리
        if(currentFrequency > maxFrequency){
            mode = currentNum;
        } else if (currentFrequency == maxFrequency){
            mode = -1;
        }
        
        
        return mode;
    }
}