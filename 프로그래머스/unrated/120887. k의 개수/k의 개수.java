class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int a = i; a <= j; a++) {
            int n = a;
            while (n > 0) {
                int num = n % 10;
                if (num == k) {
                    answer++;
                }
                n /= 10;
            }
        }
        return answer;
    }
}