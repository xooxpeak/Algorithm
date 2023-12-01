import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        
        for(int i=0; i<array.length; i++){
            if(i == 0 || Math.abs(array[i]-n) < Math.abs(answer-n)){
                answer = array[i];
            } else if(answer == n){
                break;
            }
        }
        return answer;
    }
}