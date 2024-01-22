class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a) {
            answer += (n / a) * b;   // a개당 b개를 줌 => a로 나눈 몫 * b개
            n = n / a * b + n % a;  // 나머지 병수가 있으므로 a로 나눈 나머지를 더해준다.
        }
        
        return answer;
    }
}