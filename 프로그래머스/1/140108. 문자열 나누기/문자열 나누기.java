class Solution {
    public int solution(String s) {
        char first = s.charAt(0);   // 문자열 s의 첫번째 문자를 fisrt 변수에 저장
        int firstNum = 0;   // 첫번째 문자의 개수
        int diff = 0;   // 첫번째 문자와 다른 문자의 개수
        int answer = 0;
        
        for(int i=0; i<s.length(); i++) {   // 문자열 s를 순회하면서
            if(firstNum == diff) {   // 첫번째 문자의 개수와 다른 문자의 개수가 같다면
                answer++;   // answer 증가
                first = s.charAt(i);   // 그 다음 글자로 업데이트 해서 반복
            }
            
            if(s.charAt(i) == first) firstNum++;   // 현재 문자(i)가 첫번째 문자가 같다면 첫번째 문자의 개수증가
            else diff++;   // 아니라면 다른 문자의 개수 증가
                
        }
        return answer;
    }
}