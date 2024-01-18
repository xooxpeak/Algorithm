class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i=0; i<=number.length; i++) {   // 첫번째 번호
            for(int j=i+1; j<number.length; j++) {   // 두번째 번호
                for(int k=j+1; k<number.length; k++){   // 세번째 번호
                    if((number[i] + number[j] + number[k]) == 0) answer++;  // 합한 값이 0이면 answer 증가
                }
            }
        }
        
        return answer;
    }
}