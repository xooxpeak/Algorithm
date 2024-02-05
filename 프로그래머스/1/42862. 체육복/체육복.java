import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        // 오름차순 정렬
        Arrays.sort(reserve);
        Arrays.sort(lost);
        
        // 도난 당하지 않은 학생 수 = 전체 - 도난 당한 학생 수
        answer = n - lost.length;
        
        // 여벌 체육복을 가져왔지만 도난 당한 학생 수
        // 다른 학생에게 체육복을 빌려줄 수 없음
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {   // 현재 도난당한 학생이 여벌 체육복을 가져온 학생 중에 있다면
                if(lost[i] == reserve[j]) {
                    answer++;   // 체육복을 찾은 경우 수업듣기 가능
                    lost[i] = -1;   // 해당 학생을 표시하여 중복 방지
                    reserve[j] = -1;   // 해당 여벌 체육복을 표시하여 중복 방지
                    break;
                }
            }
        }
        
        // 도난 당했지만 체육복을 빌릴 수 있는 학생 수
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]) {
                    answer++;   // 체육복을 빌린 경우
                    reserve[j] = -1;   // 해당 여벌 체육복을 표시하여 중복 방지
                    break;
                }
            }
        }
        
        return answer;
    }
}