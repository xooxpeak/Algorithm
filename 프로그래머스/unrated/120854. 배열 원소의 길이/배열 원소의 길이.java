class Solution {
    public int[] solution(String[] strlist) {
        // strlist배열의 길이만큼 정수 배열을 생성
        int[] answer = new int[strlist.length];
        
        for(int i=0; i<answer.length; i++){  // 각 문자열의 길이를 정수 배열에 저장
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}