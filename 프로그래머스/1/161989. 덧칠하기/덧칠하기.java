class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = section[0];
        int end = section[0] + (m-1);
        
        for(int i : section) {
            if(i>=start && i<=end) continue;  // start~end 사이에 속하면 계속
            else {   // 속하지 않는 경우 -> 범위를 변경해주고, 횟수answer 1증가
                start = i;
                end = i+(m-1);
                answer++;
            }
        }   
        return answer;
    }
}