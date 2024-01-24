class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int card1Index = 0;
        int card2Index = 0;

		// goal을 순회하면서 
        for (int i = 0; i < goal.length; i++) {
        
        	// 만약 goal배열과 cards1 배열이 일치하면 card1Index를 증가
            if(card1Index < cards1.length && goal[i].equals(cards1[card1Index])) {
                card1Index++;
                continue;
            }

			// 만약 goal배열과 cards2 배열이 일치하면 card2Index를 증가
            if(card2Index < cards2.length && goal[i].equals(cards2[card2Index])) {
                card2Index++;
                continue;
            }
			
            // 일치하지 않는 경우 No
            answer = "No";
        }

        return answer;
    }
}