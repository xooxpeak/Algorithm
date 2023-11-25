class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];  // 배열 크기 지정
        int k = 0;
        for(int i=num1; i<=num2; i++){  // num1부터 num2까지 반복
            answer[k++] = numbers[i];  // answer에 해당값들 넣어주기
        }
        
        return answer;
    }
}