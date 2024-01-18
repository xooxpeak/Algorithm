class Solution {
    public int solution(String t, String p) {
        int len = p.length();   // p의 길이가 몇인지 len에 담고
        long num = Long.parseLong(p);   // p를 long타입으로 변환하여 num에 저장
        int answer = 0;
        
        for(int i=0; i<t.length()-len+1; i++) {  // 문자열 t에서 길이가 len인 모든 부분 문자열을 확인하기 위한 루프
            long diff = Long.parseLong(t.substring(i, i+len));  // 현재 위치 i에서 길이가 len인 부분 문자열만큼 잘라서 숫자로 변환
            if(diff <= num) answer++;  // diff가 num보다 작거나 같으면 answer 증가
        }
        return answer;

    }
}