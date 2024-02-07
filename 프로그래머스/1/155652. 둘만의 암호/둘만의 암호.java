import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        // 알파벳 리스트 생성
        ArrayList<Character> list = new ArrayList<>();
        // ASCII 코드를 이용하여 소문자 알파벳을 list에 추가
        // 'a'의 ASCII 코드 값은 97
        // 여기에 각각의 숫자 i를 더해주면 알파벳의 ASCII 코드 값을 얻을 수 있다.
        for(int i=0; i<26; i++) {
            list.add((char)('a'+i));
        }
        
        // skip에 포함된 문자를 제거
        for(Character item : skip.toCharArray()) {
            list.remove(item);
        }
        
        // 결과 문자열을 담을 StringBuilder 생성
        StringBuilder sb = new StringBuilder();
        
        // s 문자열을 순회
        for(Character ch : s.toCharArray()) {
            // 현재 문자 ch의 인덱스를 계산하여 변수 idx에 담기
            int idx = list.indexOf(ch);   
            // index만큼 이동한 후 리스트의 크기로 나눈 나머지 인덱스 (z를 넘어갈수도 있으니) 로 설정
            idx = (idx + index) % list.size();  
            // 결과 문자열에 새로운 문자 idx 추가
            sb.append(list.get(idx));
        }
        
        return sb.toString();
    }
}