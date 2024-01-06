class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();   // 소문자로 변환
        int cntP = 0;
        int cntY = 0;
        
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'p') cntP++;
            if (ch == 'y') cntY++;
        }
        
        if(cntP == cntY) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}