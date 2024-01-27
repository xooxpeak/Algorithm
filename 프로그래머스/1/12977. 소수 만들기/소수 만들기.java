class Solution {
    public int solution(int[] nums) {
        // 3개의 수를 합해서
        // 소수인지 판별
        
        int answer = 0;
        
        // 3개의 수를 합하기
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                   int sum = nums[i]+nums[j]+nums[k];
                    
                    // 소수 판별
                    boolean yn = false;
                    for(int n=3; n<sum; n++) {
                        if(sum % n == 0) yn = true;
                    }
                    if(!yn) answer++;                 
                }
            }
        }

        return answer;
    }
}