import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        // 순서o 
        // 길이가 5인 배열 안의 원소들이 순서대로 일치하는지?
        // 가장 높은 점수 받은 사람 리턴. 여럿일 경우 오름차순 정렬.
        
        int[] pattern1 = {1, 2, 3, 4, 5};    // 1번 수포자
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};    // 2번 수포자
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};    // 3번 수포자

        int[] scores = new int[3];    // 1,2,3번의 각 맞은 문제 갯수를 담을 배열

        // 정답answers의 길이만큼 순회하면서 수포자들 점수 계산.
        // 각 인덱스의 값이 일치하는지 비교. 일치한다면 해당 사람의 카운트 +1
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i%5]) scores[0]++;
            if (answers[i] == pattern2[i%8]) scores[1]++;
            if (answers[i] == pattern3[i%10]) scores[2]++;
        }

        // 가장 많이 맞은 점수 (최대값) 비교해서 담기
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        // 정답이 여러 명일 수 있음 (동점자)
        List<Integer> winners = new ArrayList<>();

        // 각 scores를 순회하면서 최고점수랑 같은 사람을 winners 리스트에 담아주기
        // 인덱스는 0부터 이기 때문에 i+1을 해줌
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) winners.add(i + 1);
        }

        // Integer 값을 int 배열로 변환해서 반환
        return winners.stream().mapToInt(Integer::intValue).toArray();
    }
}
