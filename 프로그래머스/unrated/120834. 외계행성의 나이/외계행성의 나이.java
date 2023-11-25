import java.util.HashMap;

class Solution {
    public String solution(int age) {
        String answer = "";
        
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "a");
        map.put(1, "b");
        map.put(2, "c");
        map.put(3, "d");
        map.put(4, "e");
        map.put(5, "f");
        map.put(6, "g");
        map.put(7, "h");
        map.put(8, "i");
        map.put(9, "j");
        
        StringBuilder sb = new StringBuilder();
        while(age>0){
            int alpha = age%10;  // 10으로 나눈 나머지는 1의 자리
            age /= 10;  // 다음 자릿수
            sb.append(map.get(alpha));  // 현재 자리의 숫자에 해당하는 알파벳을 sb에 추가
        }
        answer = sb.reverse().toString();  // 1의 자리부터 나왔으니까 반대로 뒤집은 후 문자열로 변환
        
        return answer;
    }
}