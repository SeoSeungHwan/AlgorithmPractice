package backjoon.stack.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<n; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
            String str = stringTokenizer.nextToken();
            if(str.equals("push")){
                stack.add(Integer.parseInt(stringTokenizer.nextToken()));
            }else if(str.equals("pop")){
                if(stack.empty()){
                    stringBuilder.append(-1 +"\n");
                }else{
                    stringBuilder.append(stack.pop()+"\n");
                }
            }else if(str.equals("size")){
                stringBuilder.append(stack.size()+"\n");
            }else if(str.equals("empty")){
                if(stack.empty()){
                    stringBuilder.append(1+"\n");
                }else{
                    stringBuilder.append(0+"\n");
                }
            }else if(str.equals("top")){
                if(stack.empty()){
                    stringBuilder.append(-1+"\n");
                }else{
                    stringBuilder.append(stack.peek()+"\n");
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
