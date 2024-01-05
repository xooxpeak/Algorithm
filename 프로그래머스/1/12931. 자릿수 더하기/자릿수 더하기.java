import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while (n > 0) {
            answer += n % 10;   // 1의 자리부터 더하기
            n /= 10;   // 다음 자릿수로 넘어가게 함
        }

        return answer;
    }
}