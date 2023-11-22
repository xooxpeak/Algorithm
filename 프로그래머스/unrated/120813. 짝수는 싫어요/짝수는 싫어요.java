class Solution {
    public int[] solution(int n) {
        int[] answer;
        // answer 배열의 길이
        if(n%2==0){  // n이 짝수일 경우
            answer = new int[n/2];  // 배열의 길이는 n의 절반
        } else{  // n이 홀수일 경우
            answer = new int[(n+1)/2];  // n+1의 절반
        }
        for(int i=0; i<answer.length; i++){  // i가 0부터 배열의 길이만큼 반복
            answer[i]=(i*2)+1;  // 2n+1 : 홀수만 담기
        }
        return answer;
    }
}