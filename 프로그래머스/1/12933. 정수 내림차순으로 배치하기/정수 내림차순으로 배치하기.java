import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);   // 오름차순 정렬
        
        StringBuilder sb = new StringBuilder();
        for(String answer : arr) {
            sb.append(answer);  // 값 하나씩 합치기
        }
        
        return Long.parseLong(sb.reverse().toString());  // 반대로 내림차순 정렬
    }
}