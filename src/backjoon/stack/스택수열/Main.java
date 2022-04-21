package backjoon.stack.스택수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        Stack<Integer> stack = new Stack<>();


        StringBuilder stringBuilder = new StringBuilder();

        int index =1;
        for(int i=0; i<n;i++){
            int num = Integer.parseInt(bufferedReader.readLine());
            while(true){
                if(stack.empty()){
                    stack.push(index++);
                    stringBuilder.append("+"+"\n");
                }else{
                    if(stack.peek() != num){

                            if(num < index){
                                stringBuilder.setLength(0);
                                stringBuilder.append("NO");
                                System.out.println(stringBuilder);
                                System.exit(0);
                            }

                        stack.push(index++);
                        stringBuilder.append("+"+"\n");
                    }else{
                        stack.pop();
                        stringBuilder.append("-"+"\n");
                        break;
                    }
                }
            }
        }
        System.out.println(stringBuilder);
    }
}

