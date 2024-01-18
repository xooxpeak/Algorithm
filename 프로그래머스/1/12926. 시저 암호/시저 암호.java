class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] ch = s.toCharArray();
        
        for(char c : ch) {
            if(c == 32) answer += " ";   // 아스키코드 32는 공백
            else {
                if(c <= 90) {
                    c += n;
                    if(c > 90) c -= 26;   // 90(Z)를 넘어간다면 -26
                } else {
                    c += n;
                    if(c > 122) c -= 26;   // 122(z)를 넘어간다면 -26
                }
                answer += c;
            }
        }
        
        return answer;
    }
}