class Solution {
    public int solution(int[][] dots) {
        int w = 0;   // 너비
        int h = 0;   // 높이
        
        int x = dots[0][0];   // dots의 첫번째 행
        int y = dots[0][1];   // dots의 두번째 행
        
        for(int i=1; i<dots.length; i++){
            if(x != dots[i][0]) w = Math.abs(x - dots[i][0]);
            if(y != dots[i][1]) h = Math.abs(y - dots[i][1]);
        }
        
        return w*h;
    }
}