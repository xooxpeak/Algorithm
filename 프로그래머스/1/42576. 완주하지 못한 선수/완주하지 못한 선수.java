import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 결과를 저장할 변수를 초기화
        String answer = "";

        // 참가자 이름과 해당 이름의 참가 횟수를 저장하는 HashMap을 생성
        HashMap<String, Integer> map = new HashMap<>();

        // 참가자 목록을 순회하면서 HashMap에 이름과 횟수를 저장
        for (String player : participant) 
            map.put(player, map.getOrDefault(player, 0) + 1);

        // 완주자 목록을 순회하면서 HashMap에 있는 참가자의 횟수를 감소시킵니다.
        for (String player : completion) 
            map.put(player, map.get(player) - 1);

        // HashMap을 순회하기 위해 iterator를 생성
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        // HashMap을 순회하면서 값이 0이 아닌 참가자를 찾습니다.
        while(iter.hasNext()){
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0){
                // 참가자의 횟수가 0이 아니라면 해당 참가자를 정답으로 지정하고 반복문을 종료.
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}