class Solution {
    static int factorial(int a) {
        if (a <= 1) {
            return a;
        } else {
            return factorial(a - 1) * a;
        }
    }
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= 10; i++) {
            if (factorial(i) <= n) {
                answer = i;
            }
        }
        return answer;
    }
}