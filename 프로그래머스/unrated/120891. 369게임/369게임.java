class Solution {
    public int solution(int order) {
        int answer = 0;
        
        while(order>0){
            int game = order % 10;
            if(game==3 || game==6 || game==9){
                answer++;
            }
            order /= 10;
        }
        return answer;
    }
}