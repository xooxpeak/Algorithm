import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String, Integer> map = new HashMap<>();  // 인물의 추억 점수
        
        // 사람 별 추억점수를 map 담기 (이름, 점수)
        for(int i=0; i<name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        // 사진에 찍힌 사람들을 배열에 담기
        for(int i=0; i<photo.length; i++) {
            String[] person = photo[i];
            int sum = 0;  // 찍힌 사람들의 점수값
        
        
            // 사진에 찍힌 사람의 이름 순차적으로 꺼내기
            for(int j=0; j<person.length; j++) {
                String personName = person[j];        

                // 찍힌 사람 이름 personName이 map의 key에 해당하는 경우 그 사람의 점수값 value을 더하기
                if(map.containsKey(personName)) {
                    sum += map.get(personName);
                }
            }
        
        answer[i] = sum;
     }
        
        return answer;
    }
}