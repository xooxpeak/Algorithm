class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        int boardX = board[0] / 2;
        int boardY = board[1] / 2;
        
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("up")) {
                if (y < boardY) {
                    y += 1;
                }
            } else if (keyinput[i].equals("down")) {
                if (y > -boardY) {
                    y -= 1;
                }
            } else if (keyinput[i].equals("left")) {
                if (x > -boardX) {
                    x -= 1;
                }
            } else if (keyinput[i].equals("right")) {
                if (x < boardX) {
                    x += 1;
                }
            }
        }
        int[] answer = {x, y};
        return answer;
    }
}