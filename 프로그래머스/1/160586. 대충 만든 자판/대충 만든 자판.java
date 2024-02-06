import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> keypad = new HashMap<>();
        
        // keypad에 문자와 해당 문자의 최소 인덱스를 저장
        for(int i=0; i<keymap.length; i++) {
            for(int j=0; j<keymap[i].length(); j++) {
                char cur = keymap[i].charAt(j);   // 현재 문자를 변수 cur에 저장
                if(keypad.containsKey(cur)) {   // 만약 keypad에 현재 문자가 이미 존재한다면
                    int idx = keypad.get(cur);   // keypad에서 특정키(cur)에 해당하는 값을 가져와 저장할건데
                    keypad.put(cur, Math.min(idx, j+1));   // 현재 문자의 최소 인덱스와 기존에 저장된 인덱스 중 작은 값을 선택하여 저장
                }
                else {
                    keypad.put(cur, j+1);   // keypad에 해당 문자가 존재하지 않으면 새로운 키로 추가
                }
            }
        }
        
        for(int i=0; i<targets.length; i++) {
            String target = targets[i];  // 현재 입력할 target 문자를 가져옴
            int count = 0;   // 현재 문자열에 대한 합산값을 저장할 변수
            boolean flag = true;   //  현재 문자열이 keypad에 포함된 문자로 이루어져 있는지 확인하기 위한 플래그를 초기화
            // 문자열을 char 배열로 변환하여 각 문자에 접근
            for(char cur : target.toCharArray()) {
                // 만약 현재 문자가 keypad에 포함되어 있다면 해당 문자의 최소 인덱스를 더해준다.
                if(keypad.containsKey(cur)) {
                    count += keypad.get(cur);
                }
                else {  // keypad에 해당 문자가 없다면 flag를 false로 설정하고 종료
                    flag = false;
                    break;
                }
            }
            // flag가 false일 경우엔 -1 반환, true일 경우엔 count 반환
            answer[i] = flag == false ? -1 : count;
        }
        
        return answer;
    }
}