import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;   // 지원해줄 수 있는 부서의 개수
        
        Arrays.sort(d);    // 금액이 적은 순으로 지원해주기 위해 정렬
        
        if(d[0] > budget) return 0;   // 금액이 예산보다 크다면 지원해줄 수 있는 부서의 개수는 0개
        
       // 금액이 예산보다 적다면 지원 가능
        for(int i=0; i<d.length; i++) {
            if(budget >= d[i]) {
                budget -= d[i];   // 예산에서 금액을 순서대로 빼주기
                answer++;   // 한 번 뺄 때 마다 개수는 증가
            }
        }
        
        return answer;
    }
}