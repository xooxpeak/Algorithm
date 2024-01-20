class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();   // 음식 배치를 담을 sb
        
        for(int i=1; i<food.length; i++) {
            int arr = food[i]/2;   // 첫 선수의 음식 배치
            sb.append(String.valueOf(i).repeat(arr));
        }
        
        String answer = sb + "0";    // 0 더하고
        answer += sb.reverse();     // 순서 뒤집은 = 두번째 선수가 먹을 음식 배치 더하기
        
        return answer;
    }
}