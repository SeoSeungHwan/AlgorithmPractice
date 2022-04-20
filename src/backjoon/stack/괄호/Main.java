package backjoon.stack.괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();

        int n = Integer.parseInt(bufferedReader.readLine());

        for(int i=0; i<n; i++){
            stack.clear();
            String str = bufferedReader.readLine();

            boolean check =true;
            for(int j=0; j<str.length();j++){
                if(str.charAt(j) =='('){
                    stack.add('(');
                }else{
                    if(stack.empty()){
                        System.out.println("NO");
                        check = false;
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }

            if(check){
                if(stack.size()!=0){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }

            }
        }
    }
}
