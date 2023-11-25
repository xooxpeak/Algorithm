class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){  // 배열 크기만큼 순회하면서
                if(emergency[i] <= emergency[j]){  // 다른 원소보다 작거나 같으면
                    answer[i]+=1;  // 1을 더해준다.
                }
            }
        }
        return answer;
    }
}