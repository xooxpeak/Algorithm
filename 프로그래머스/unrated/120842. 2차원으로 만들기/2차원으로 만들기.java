class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];  // num_list의 길이를 n으로 나눈 값과 n으로 설정
        for (int i = 0; i < (num_list.length / n); i++) {  // 행
            for (int j = 0; j < n; j++) {  // 열
                answer[i][j] = num_list[i * n + j];
            }
        }
        return answer;
    }
}