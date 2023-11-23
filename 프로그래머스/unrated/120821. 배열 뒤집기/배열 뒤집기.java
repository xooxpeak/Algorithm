class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];  //num_list 배열의 크기만큼 answer 배열 생성
        for(int i=0; i<num_list.length; i++){
            answer[num_list.length-i-1] = num_list[i];  //num_list의 값들을 반대되는 순서로 넣어줌. 인덱스는 0부터 시작해 배열의 크기보다 1작기 때문에 -1 해줌.
        }
        return answer;
    }
}