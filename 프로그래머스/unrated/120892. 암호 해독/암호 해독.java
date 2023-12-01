class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        
        String[] cp = cipher.split("");
        for(int i=0; i<cp.length; i++) {
            if((i+1)%code == 0){
                sb.append(cp[i]);
            }
        }
        return sb.toString();
    }
}