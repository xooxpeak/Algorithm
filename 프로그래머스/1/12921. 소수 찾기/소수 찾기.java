class Solution {
    public int solution(int n) {
    	// 2는 소수이기 때문에 초기값 1로 선언
        int answer = 1;
        
        // 3부터 n까지 반복하여 현재의 수인 i가 소수라면(true) answer+1
        for (int i = 3; i <= n; i++) {
            if (isPrime(i)) answer += 1;
        }
        
        return answer;
    }
    
    // 소수 판별 메서드
    private boolean isPrime(int num) {
    	// 2부터 num의 제곱근까지 반복
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
        	// num이 i로 나눈 나머지가 0이면 소수가 아님
            if (num % i == 0) {
                return false;
            }
        }
        
        // 어떤 수로도 나누어지지 않으면 소수
        return true;
    }
}