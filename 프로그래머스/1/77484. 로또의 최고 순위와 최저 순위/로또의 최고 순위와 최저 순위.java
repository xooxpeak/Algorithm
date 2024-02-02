class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];    // [최고순위, 최저순위]
        
        int cnt1 = 0;   // 0의 갯수
        int cnt2 = 0;   // lottos와 win_nums에서 일치하는 숫자의 갯수
        
        // lottos를 순회하면서 0의 갯수 구하기
        for(int i : lottos) {
            if(i == 0) {
                cnt1++;
                continue;
            }
            
            // win_nums 순회하면서 lottos와 win_nums에서 일치하는 숫자의 갯수 구하기
            for(int j : win_nums) {
                if(i == j) cnt2++;
            }
        }
        
        answer[0] = getGrade(cnt1+cnt2);   // 최고순위는 cnt1와 cnt2를 합해 결정
        answer[1] = getGrade(cnt2);   // 최저순위는 0을 제외하고 일치하는 숫자의 갯수로 결정
        
        return answer;
    }
    
    // 순위 정하는 메소드
    public int getGrade(int n) {
        switch(n) {
             case 6 :
                return 1;
            case 5 :
                return 2;
            case 4 :
                return 3;
            case 3 :
                return 4;
            case 2 :
                return 5;
            default :
                return 6;
        }
    }
}