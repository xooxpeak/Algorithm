import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        
        // integer를 담는 stack 선언
        Stack<Integer> st = new Stack<Integer>();
        
        // 전달 받은 배열만큼 반복
        for(int i=0; i<arr.length; i++) {
            // 배열의 첫 번째 요소를 stack에 삽입
            if(i==0) st.push(arr[i]);           
            // 인덱스 1부터는 stack의 최상단 값(peek)이 arr[i]의 값과 일치 여부 확인 후,
            // 일치하지 않을 경우에만 stack에 push함
            else if(st.peek() != arr[i]) st.push(arr[i]);
        }
        
        answer = new int[st.size()];   // answer의 크기는 stack의 사이즈와 동일하게 생성
        
        // stack의 사이즈만큼 순회하면서
        // stack에서 꺼낸 값들을 pop하여 담을건데
        // stack은 LIFO => 실제 배열의 역순이므로
        // 역순으로 담아야 순서대로 담기게 된다. => i가 st.size()-1부터, -1씩 줄이면서, 0보다 클 때까지 반복
        for(int i=st.size()-1; i>=0; i--) {
            answer[i] = st.pop();
        }

        return answer;
    }
}
