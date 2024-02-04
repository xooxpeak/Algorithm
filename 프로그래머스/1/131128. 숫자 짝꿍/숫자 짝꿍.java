import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        // 0~9까지 등장한 횟수를 저장할 배열
        int[] cntX = new int[10];
        int[] cntY = new int[10];
        
        // X 문자열에서 각 숫자의 등장 횟수 계산
        for(String tmpX : X.split("")) cntX[Integer.parseInt(tmpX)]++;
        // Y 문자열에서 각 숫자의 등장 횟수 계산
        for(String tmpY : Y.split("")) cntY[Integer.parseInt(tmpY)]++;
        
        // 등장한 숫자 조합하기
        StringBuilder sb = new StringBuilder();
        
        // 내림차순 정렬
        for(int i=9; i>=0; i--) {
            while(cntX[i] > 0 && cntY[i] > 0) {
                sb.append(i);
                cntX[i]--;
                cntY[i]--;
            }
        }
        
        // 결과 저장할 변수
        String answer = "";
        
        // 짝꿍 없으면 = 조합된 숫자 없으면 -1 반환
        if("".equals(sb.toString())) {
            answer = "-1";
        } else if("0".equals(sb.toString().substring(0,1))) {
            // 짝꿍이 0으로만 구성 = 조합된 숫자가 있지만 첫 자리가 0이면 0 반환
            answer = "0";
        } else {
            // 그 외에는 조합된 숫자를 반환
            answer = sb.toString();
        }
        return answer;
    }
}