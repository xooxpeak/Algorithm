class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++) {   // 한 변의 길이만큼 순회
            // 2진수로 변환, 하나라도 1인 경우 1로 저장됨
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);   
            answer[i] = answer[i].replace('0', ' ');   // 2진수값이 0 -> 공백
            answer[i] = answer[i].replace('1', '#');   // 2진수값이 1 -> #
            
            // n자리 수가 될 때까지 앞에 공백을 추가
            while (answer[i].length() < n) {
                answer[i] = ' ' + answer[i];
            }
        }
        
        return answer;
    }
}