class Solution {
    public String solution(String bin1, String bin2) {
        // 정수로 변환
        int n = Integer.parseInt(bin1, 2);
        int m = Integer.parseInt(bin2, 2);
        int sum = n+m;  // 두 정수의 합
        
        // 두 정수의 합을 다시 이진수 문자열로 변환
        String answer = Integer.toBinaryString(sum);
        
        return answer;
    }
}