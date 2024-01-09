import java.util.Arrays;

public class Solution {
    public String solution(String[] seoul){
        //x에 김서방의 위치를 저장하세요.
        int x = Arrays.asList(seoul).indexOf("Kim");  
        
        return new StringBuilder("김서방은 ").append(x).append("에 있다").toString();
        
    }
}