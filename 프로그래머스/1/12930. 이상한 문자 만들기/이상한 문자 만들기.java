class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        
        for(int i=0; i<s.length(); i++) {    // 문자열 s를 돌면서
            char ch = s.charAt(i);
            if(ch == ' ') {     // ch가 공백이라면
                answer += " ";   // answer에 공백을 추가해주고
                cnt = 0;   // cnt를 0으로 초기화 -> 공백을 기준으로 단어가 나뉨
                continue;
            }
            
            if((cnt%2) == 0) {   // 짝수라면
                answer += String.valueOf(Character.toUpperCase(ch));  // Char를 String으로 변경해주고 대문자로 변경
                cnt++;   // cnt +1
            } else {   // 홀수라면
                answer += String.valueOf(Character.toLowerCase(ch));  // Char를 String으로 변경해주고 소문자로 변경
                cnt++;   // cnt +1
            }
        }
        
        return answer;
    }
}