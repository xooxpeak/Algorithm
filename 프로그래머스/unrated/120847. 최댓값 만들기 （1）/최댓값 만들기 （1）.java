import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);  // 오름차순 배열
      return numbers[numbers.length-1] * numbers[numbers.length-2];  // 인덱스는 0부터 시작하기 때문에 -1 해줌
    }
}