class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = total / num;  // 연속된 수의 중앙값
        int first;  // 연속된 수의 첫 번째 값
        
        if(num % 2 == 0) {  // num이 짝수
            first = mid - num/2 + 1;
        } else {  // num이 홀수
            first = mid - num/2;
        }
        
        for(int i=0; i<num; i++) {  // 연속된 숫자 배열 생성
            answer[i] = first++;
        }
        
        return answer;
    }
}