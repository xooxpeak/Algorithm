import java.util.*;
 
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;   // 0으로 초기화
 
        Arrays.sort(score);   // 오름차순 정렬
 
        // 역순으로 순회
        // 구간의 끝(i)에서 시작하여 'm'만큼 건너뛰어 계산
        for(int i = score.length; i >= m; i -= m){  
            answer += score[i - m] * m;   // 현재 구간의 시작 인덱스(i-m)부터 m만큼의 원소를 곱하여 합산
        }
 
        return answer;
    }
}
