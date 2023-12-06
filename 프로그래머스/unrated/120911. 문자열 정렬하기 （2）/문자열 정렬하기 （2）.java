import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        
        my_string = my_string.toLowerCase();
        
        char[] str = my_string.toCharArray();
        Arrays.sort(str);
        String answer = new String(str);
        
        return answer;
    }
}