class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int n = x;
        
        while (n != 0) {
            sum += n % 10;   // 각 자릿수 구해서 sum 에 더하기
            n /= 10;   // 다음 자릿수로 넘어가기
        }
        
        return x % sum == 0? true : false;
    }
}