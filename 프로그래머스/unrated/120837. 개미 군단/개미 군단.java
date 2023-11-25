class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        answer += hp/5;   // 장군개미 수
        hp = hp%5;  // 나머지 수
        
        answer += hp/3;   // 병정개미 수
        hp = hp%3;   // 나머지 수
        
        answer += hp/1;   // 일개미 수
        
        return answer;
    }
}