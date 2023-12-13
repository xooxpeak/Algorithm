class Solution {
    public int[] solution(int[][] score) {
        int sc = score.length;
        int[] answer = new int[sc];
        int[] sum = new int[sc];
        
        for(int i=0; i<sc; i++){
            sum[i] = score[i][0]+score[i][1];
        }
        
        for(int i=0; i<sc; i++) {
            answer[i] = 1;
            for(int j=0; j<sc; j++) {
                if(sum[i] < sum[j]) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}