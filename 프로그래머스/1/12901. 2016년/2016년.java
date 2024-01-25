class Solution {
    public String solution(int a, int b) {
        // 날짜의 요일 (2016.1.1은 금요일부터 시작)
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        // 각 월의 일수
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 30};
        
        // 총 일수
        int answer = 0;
        
        // a 이전 달까지 총 일수 더하기
        for(int i=0; i<a-1; i++){
            answer += month[i];
        }
        
        // 그 다음 남은 일수 더하기
        // index는 0부터니까 b-1
        answer += b-1;
        
        // 일주일이니까 7로 나눈 나머지의 인덱스를 가진 요일 반환
        return day[answer%7];
    }
}