import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<String>();
        boolean flag = true;
        
        for(int i=0; i<words.length; i++){
            if(i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0) 
               || list.contains(words[i])){   // 이전에 등장한 단어인경우
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                flag = false;
                break;
            }
            
            list.add(words[i]); // 현재 단어 리스트에 넣기
        }
        if(flag) return new int[]{0, 0};
        return answer;
    }
}