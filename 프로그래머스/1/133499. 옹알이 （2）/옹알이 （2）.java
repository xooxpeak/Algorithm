import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i=0; i<babbling.length; i++){
            // 만약 연속해서 같은 발음이 나온다면 continue
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")) 
                continue;
        
            // 연속해서 같은 발음이 나오지 않는다면, 각 발음을 공백으로 치환
            babbling[i] = babbling[i].replace("aya"," ");
            babbling[i] = babbling[i].replace("ye"," ");
            babbling[i] = babbling[i].replace("woo"," ");
            babbling[i] = babbling[i].replace("ma"," ");
            babbling[i] = babbling[i].replace(" ", "");

            // 해당 문자열의 길이가 0이라면 answer를 증가
            if(babbling[i].length() == 0) answer++;
        }
        
        return answer;
    }
}
