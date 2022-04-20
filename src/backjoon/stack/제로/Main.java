package backjoon.stack.제로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(bufferedReader.readLine());

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(bufferedReader.readLine());
            if(num ==0){
                stack.pop();
            }else{
                stack.add(num);
            }
        }
        int sum =0;
        for (int num:stack) {
            sum += num;
        }
        System.out.println(sum);
    }
}
