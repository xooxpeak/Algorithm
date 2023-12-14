import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        if(Arrays.equals(a, b)) {
            return 1; 
        } else 
            return 0;
    }
}