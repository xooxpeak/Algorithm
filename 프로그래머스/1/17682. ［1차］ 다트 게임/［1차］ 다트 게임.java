class Solution {
    public int solution(String dartResult) {
        String temp = "";   // 문자열 내 한 번의 점수 저장할 변수
        int[] scores = new int[3];   // 다트를 세 번 던지는 게임이므로, 세 번의 점수를 저장할 배열
        int idx = 0;   // 인덱스
        int answer = 0;
            
        // 1. dartResult 문자열 순회
        for(int i=0; i<dartResult.length(); i++) {
            // 각각의 문자에 따라서 조건 처리하기 위한 switch문
            switch(dartResult.charAt(i)) {
                // S : 1제곱 / 다음 점수를 위해 인덱스idx 증가 / 점수 저장하는 temp 초기화
                case 'S':
                    scores[idx] = (int)Math.pow(Integer.parseInt(temp), 1);   // temp를 1제곱해서 정수로 변환해 저장
                    idx++;   // 인덱스 증가
                    temp = "";   // 초기화
                    break;
                // D : 2제곱 / 다음 점수를 위해 인덱스idx 증가 / 점수 저장하는 temp 초기화
                case 'D':
                    scores[idx] = (int)Math.pow(Integer.parseInt(temp), 2); 
                    idx++;   
                    temp = "";
                    break;
                // T : 3제곱 / 다음 정수를 위해 인덱스idx 증가 / 점수 저장하는 temp 초기화
                case 'T':
                    scores[idx] = (int)Math.pow(Integer.parseInt(temp), 3);
                    idx++;
                    temp = "";
                    break;
                // * : 해당점수와 이전의 점수 *2 / idx는 S,D,T 처리 후 증가하기 때문에 idx-1, idx-2 후 *2 해준다.
                case '*':
                    scores[idx-1] *= 2;
                    if(idx > 1) scores[idx-2] *= 2;   // 인덱스가 1보다 크다면 2를 빼서 이전의 점수도 *2 처리해준다.
                    break;
                // # : 해당점수 *-1
                case '#':
                    scores[idx-1] *= -1;
                    break;
                // 그 외의 정수들은 temp 변수에 저장해 둔다.
                default:
                    temp += String.valueOf(dartResult.charAt(i));
                    break;         
            }
       }
        
        // 2. 위 과정을 통해 구한 각 횟수의 점수를 모두 더한다.
        for(int i=0; i<scores.length; i++) {
            answer += scores[i];
        }
        
        return answer;
    }
}