class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long pay = 0;   // 총 지불할 금액
        
        for(int i=1; i<= count; i++) {
            pay += price * i;   // 총 지불할 금액 += 이용료 * 횟수
            
            if(money-pay >= 0) {   // 돈 안모자름
                answer = 0;
            } else {    // 돈 모자름
                answer = pay - money;
            }
        }
        

        return answer;
    }
}