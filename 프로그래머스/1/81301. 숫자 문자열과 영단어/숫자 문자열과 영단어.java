import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        
        String answer = "";   // 최종 반환값 변수
        String tmp = "";   // 현재까지 처리 중인 알파벳 문자열을 저장할 변수
        
        for(int i=0; i<s.length(); i++) {   // 문자열 s를 한 글자씩 순회
            char c = s.charAt(i);   // 현재 순회 중인 문자를 c에 가져오기
            if(Character.isDigit(c)) {   // c가 숫자라면
                answer += c;   // answer에 그대로 추가
                tmp = "";   // tmp를 초기화
            } else {
                tmp += c;   // c가 숫자가 아니고 알파벳이라면
                if(map.get(tmp) != null) {   // 만약 tmp가 map의 key로 존재한다면
                    answer += map.get(tmp);   // key값에 맞는 value를 꺼내서 answer에 추가
                    tmp = "";   // tmp를 초기화
                }
            }     
        }
        
        return Integer.parseInt(answer);   // 문자열을 정수로 변환해서 반환
    }
}