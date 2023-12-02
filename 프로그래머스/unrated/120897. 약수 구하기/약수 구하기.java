import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];
        int divisor = 0;
        
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                answer[divisor++] = i;
            }
        }
        return Arrays.copyOf(answer, divisor);
    }
}