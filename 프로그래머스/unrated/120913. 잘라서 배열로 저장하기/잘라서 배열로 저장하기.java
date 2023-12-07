class Solution {
    public String[] solution(String my_str, int n) {
        int size = (int)Math.ceil((double)my_str.length() / n);
        String[] answer = new String[size];
        int index = 0;
        for (int i = 0; i < my_str.length(); i += n) {
            int endIndex = Math.min(i + n, my_str.length());
            answer[index++] = my_str.substring(i, endIndex);
        }
        return answer;
    }
}