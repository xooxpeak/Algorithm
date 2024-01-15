class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];   // 배열 크기는 2
        
        // 최대공약수
        int a = n, b = m;
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        } 
        answer[0] = a;    
        
        // 최소공배수
        answer[1] = (n * m) / answer[0];
        
        return answer;
    }
}