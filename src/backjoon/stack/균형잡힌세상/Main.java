package backjoon.stack.균형잡힌세상;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        Stack<Character> stack = new Stack<>();

        loop:
        while(true) {
            stack.clear();
            String str = scanner.nextLine();
            if (str.length() == 1 && str.charAt(0) == '.') {
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.empty() || stack.peek() != '(') {
                        System.out.println("no");
                        continue loop;
                    } else {
                        stack.pop();
                    }
                } else if (c == ']') {
                    if (stack.empty() || stack.peek() != '[') {
                        System.out.println("no");
                        continue loop;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(stack.empty()){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}

