class Solution {
    // 1. 피보나치 수를 참조할 메모이제이션.
    static int dp[] = new int[100001];
    
    // 2. 피보나치 메소드
    public static int fibonacci(int n){
        // 3. 0인 경우는 0을 반환.
        if(n == 0) return 0;
        // 4. 1인 경우는 1을 반환.
        if(n == 1) return 1;
        
        // 5. dp[n]에 아직 값이 없다면, 아래의 식을 수행.
        if(dp[n] == 0)
            dp[n] = (fibonacci(n-1)+ fibonacci(n-2)) % 1234567;
        
        // 6. 값이 있다면 dp의 값을 참조해 바로 반환.
        return dp[n];
    }
    
    public int solution(int n) {
        int answer = 0;
        
        // 7. 피보나치 수를 저장.
        answer = fibonacci(n);
        
        return answer;
    }
}