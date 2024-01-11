class Solution {
    public int[] solution(int[] arr) {
        // 배열 길이가 1인 경우 -1로 반환
        if (arr.length==1) {
            int[] answer = {-1};
            return answer;
        }

        // 가장 작은 수 하나 빼기 => 총 배열 길이에서 -1 한 길이가 됨
        int[] answer = new int[arr.length-1];
        
        int min = Integer.MAX_VALUE;   // int 타입의 최댓값
        for (int i=0; i<arr.length; i++){   // 배열에서 가장 작은 수 찾기
            min = Math.min(min, arr[i]);    // 현재 원소가 최솟값보다 작다면 min 갱신
        }
        
        int idx = 0;   // 가장 작은 수를 제외한 배열을 만들 인덱스 변수
        for (int j=0; j< arr.length; j++){   // 가장 작은 수 제외하고 담기
            if (arr[j]==min){    // 현재 원소가 가장 작은 수인 경우 무시하고 다음 원소로 이동
                continue;
            }
            else{   // 현재 원소가 가장 작은 수가 아닌 경우
                answer[idx++] = arr[j];   // answer에 저장하고 인덱스 증가
            }
        }
        return answer;
    }
}