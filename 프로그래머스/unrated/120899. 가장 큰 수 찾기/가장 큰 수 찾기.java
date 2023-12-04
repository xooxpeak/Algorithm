class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];  // 최대값과 인덱스 갖도록 배열 초기화
        int max=0;
        int index=0;
        
        for(int i=0; i<array.length; i++) {
            if(max < array[i]){   // 만약 max가 i번째 값보다 작으면
                max = array[i];   // max를 i번째 값으로 갱신
                index = i;  // 인덱스도 갱신
            }
        }
        
        answer[0] = max;
        answer[1] = index;
        
        return answer;
    }
}