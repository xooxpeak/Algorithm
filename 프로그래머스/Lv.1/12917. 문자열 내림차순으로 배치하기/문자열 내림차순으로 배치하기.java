import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);  // 오름차순 정렬
        
        return new StringBuilder(new String(arr)).reverse().toString();   // 뒤집고 문자열로 변환하여 리턴
    }
}