import java.util.*;

class Solution {
    public String solution(String s) {
        
    	// 문자열을 소문자로 변경
        s = s.toLowerCase();
        boolean check = true;
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                check = true;
            } else if (check) {
            	// 대문자로 변경
                c = Character.toUpperCase(c);
                check = false;
            }
            sb.append(c);
        }
                
        return sb.toString();
    }
}