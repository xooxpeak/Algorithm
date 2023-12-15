class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        
        if(A.equals(B)){   // A와 B가 같은 경우
            answer = 0;
        }
        
        for(int i=0; i<A.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=A.length()-i; j<A.length(); j++) {
                sb.append(A.charAt(j));
            }
            
            for(int j=0; j<A.length()-i; j++) {
                sb.append(A.charAt(j));
            }
            
            if(sb.toString().equals(B)) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}