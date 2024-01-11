class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();   // 길이
        
        if(s.length() % 2 == 0) {  // 길이가 짝수
            answer += s.charAt(length/2 - 1);
            answer += s.charAt(length/2);
        } else {  // 길이가 홀수
            answer += s.charAt(length/2);
        }
        
        return answer;
    }
}