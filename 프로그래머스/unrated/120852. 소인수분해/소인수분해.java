import java.util.ArrayList;
import java.util.TreeSet;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                list.add(i);
                n /= i;
            }
        }
        TreeSet<Integer> set = new TreeSet<>(list);
        
        int[] answer = new int[set.size()];
        int index = 0;
        for (int i: set) {
            answer[index++] = i;
        }
        return answer;
    }
}