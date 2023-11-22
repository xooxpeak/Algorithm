class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        for(int i=0; i<numbers.length; i++){   // 배열의 길이만큼 반복
            answer += numbers[i];  // 배열의 i번째 값을 차례차례 더한다.
        }
        answer = answer/numbers.length;  // 합쳐진 값을 배열의 길이로 나눈다.
        return answer;
    }
}