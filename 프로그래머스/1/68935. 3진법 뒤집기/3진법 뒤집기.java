class Solution {
    public int solution(int n) {
        String str = "";

        // 10진법 -> 3진법
        while (n > 0) {
            str += n % 3;   // n을 3으로 나눈 나머지를 문자열 str에 추가
            n /= 3;  // n을 3으로 나눈 몫으로 갱신
        }
        
        return Integer.parseInt(str, 3);   // 문자열 str을 3진법으로 해석하여 10진수로 변환
    }
}