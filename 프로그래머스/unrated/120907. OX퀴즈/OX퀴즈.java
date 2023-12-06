class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] s = quiz[i].split(" ");
            int cal = 0;
            if (s[1].equals("+")) {
                cal = Integer.parseInt(s[0]) + Integer.parseInt(s[2]);
                if (cal == Integer.parseInt(s[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (s[1].equals("-")) {
                cal = Integer.parseInt(s[0]) - Integer.parseInt(s[2]);
                if (cal == Integer.parseInt(s[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}