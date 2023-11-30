class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] sz = s.split(" ");  // 공백을 기준으로 구분되는 문자열 배열 sz
        
        for(int i=0; i<sz.length; i++){  // sz 길이 만큼 반복
            if(sz[i].equals("Z")){  // sz 배열의 i번째 원소가 Z 라면
                answer -= Integer.parseInt(sz[i-1]);  //합에서 i-1번째의 원소를 정수로 변환시켜 뺀다.
                continue;  // 다음 번째 원소를 진행
            }
            answer += Integer.parseInt(sz[i]);  // Z가 아닐 경우 합함
        }
        
        return answer;
    }
}