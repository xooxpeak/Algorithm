class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 0;
        int index = 0;
        while (count < k) {
            if (index >= numbers.length) {  // index가 numbers의 길이보다 크거나 같다면
                index %= numbers.length;  // 나머지를 할당
            }
            answer = numbers[index];
            index += 2;  // 한 명 건너뛰기 = 2씩 증가
            count++;  // 횟수 +1
        }
        return answer;
    }
}