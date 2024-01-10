class Solution {
    public int solution(int[] numbers) {
        int sum = 45;    // 0~9까지 모두 더한 값
        for(int i : numbers) {
            sum -= i; 
        }
        return sum;
    }
}