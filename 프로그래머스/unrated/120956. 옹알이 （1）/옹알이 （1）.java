class Solution {
    public int solution(String[] babbling) {
        String[] str = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<str.length; j++){   // 발음 가능한 단어들을 찾아서
                babbling[i] = babbling[i].replace(str[j], " ");   // 공백으로 대체
            }
            
            if(babbling[i].trim().length() == 0){  // 양쪽의 공백 제거
                answer++;
            }
        }
        return answer;
    }
}