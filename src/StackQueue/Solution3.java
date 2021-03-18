package StackQueue;

import java.util.LinkedList;
import java.util.Stack;

class Solution3 {
    public int[] solution3(int[] prices) {
        int[] answer = {};

        Stack<Integer> stack = new Stack<>();

        for(int i =0; i<prices.length;i++){
            stack.push(prices[i]);
        }

        int min =0;
        for(int j=prices.length; j>=0; j--){
            min = stack.pop();
        }



        return answer;
    }
}