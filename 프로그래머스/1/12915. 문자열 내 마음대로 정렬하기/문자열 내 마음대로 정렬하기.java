import java.util.*;

class Solution {
  public String[] solution(String[] strings, int n) {
      String[] answer = {};
        answer = new String[strings.length];   // 배열 answer의 길이 = 문자열 배열 strings의 길이
        int idx = 0;  
        
        Arrays.sort(strings);   // strings를 사전순 정렬
         
        for(int i = 97; i < 123; i++) {    // 아스키코드 소문자 범위
            for(int j = 0; j < strings.length; j++) {  // strings를 순회
                if(strings[j].charAt(n) == (char)i) {   // strings의 n번째 문자가 현재 아스키코드에 해당하는지
                    answer[idx++] = strings[j];  // answer배열에 해당 문자열을 할당하고 인덱스 증가
                }
            }
        }
        return answer;
  }
}