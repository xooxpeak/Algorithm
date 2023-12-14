class Solution {
    public int solution(int chicken) {
        int answer = 0;   //서비스 치킨의 수
        
        while(chicken/10 > 0) {
            answer += chicken/10;  //서비스 치킨의 수
            chicken = chicken/10 + chicken%10;   //총 치킨의 수
        }
        return answer;
    }
}