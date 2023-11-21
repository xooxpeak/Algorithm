import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);  // 크기 순서대로 정렬
        int length = array.length;
        int answer = array[length / 2];
        return answer;
    }
}