class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        // 가장 긴 변이 배열의 원소인 경우
        for(int i=max-min; i<max; i++) {
            answer++;
        }
        
        // 나머지 한 변이 가장 긴 변인 경우
        for(int i=max+min-1; i>max; i--) {
            answer++;
        }
        return answer;
    }
}