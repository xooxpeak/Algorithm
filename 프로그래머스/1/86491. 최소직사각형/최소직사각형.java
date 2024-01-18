class Solution {
    public int solution(int[][] sizes) {
        int max_w = 0;    // 가로의 최대 길이
        int max_h = 0;    // 세로의 최대 길이
        
        for (int i = 0; i < sizes.length; i++) {
            max_w = Math.max(max_w, Math.max(sizes[i][0], sizes[i][1]));
            max_h = Math.max(max_h, Math.min(sizes[i][0], sizes[i][1]));
        }
        
        return max_w * max_h;
    }
}