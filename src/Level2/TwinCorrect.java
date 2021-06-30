package Level2;

import java.util.*;

//올바른 괄호
//https://programmers.co.kr/learn/courses/30/lessons/12909
public class TwinCorrect {
    boolean twincorrect(String s) {
        boolean answer = true;

        Stack<String> stack = new Stack<>();


        for (int i=0 ; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push("(");
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty()){
            return false;
        }
        return answer;
    }
}
