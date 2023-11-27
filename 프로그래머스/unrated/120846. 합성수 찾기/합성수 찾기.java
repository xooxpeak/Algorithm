class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){  // i가 1부터 자연수n까지 반복
            int a = 0;  // 약수의 개수 초기화
            for(int j=1; j<=n; j++){  // j가 1부터 자연수n까지 반복
                if(i%j == 0){  // i를 j로 나누어 떨어지면
                    a++;  // 약수의 개수 +1
                }
            }
            if(a>=3){
                answer++;  // 약수가 세 개 이상인 수 카운팅 +1
            }
        }
        return answer;
    }
}