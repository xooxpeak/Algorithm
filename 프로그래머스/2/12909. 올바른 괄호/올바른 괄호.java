import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else if(c == ')'){
                if(stack.empty()){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        
        return stack.empty();
    }
}