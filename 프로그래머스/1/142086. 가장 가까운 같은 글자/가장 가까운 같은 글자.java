import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] arr = s.split("");   // s를 한 글자씩 잘라서 배열 arr에 담는다.
        int[] answer = new int[arr.length];   // answer 배열의 길이는 arr 길이로 설정
        answer[0] = -1;   // 초기값을 -1로 지정 (첫 번째 글자는 처음 나온거니까 무조건 -1)

        for (int i = 1; i <arr.length; i++) {   // 두 번째 글자부터 시작
            answer[i] = -1;   // 아직 동일한 글자가 없을 경우 -1
            for (int j = i - 1; j >= 0; j--) {   // 현재 위치 이전의 문자에 대한 거리만 계산하기 위해 i-1부터 시작
                if (arr[j].equals(arr[i])) {  // 만약 글자가 동일하다면
                    answer[i] = i - j;   // 현재 값에서 가장 가까운 거리
                    break;
                }
            }
        }

        return answer;
    }
}