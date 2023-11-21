class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
       
        for(int i=0; i<numbers.length; i++){
            answer[i] = numbers[i]*2;  // numbers의 각 원소를 두 배로 만들어 저장
        }
        
        return answer;
    }
}