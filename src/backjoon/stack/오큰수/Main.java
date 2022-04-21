package backjoon.stack.오큰수;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i< n; i++){
            while(!stack.empty() && arr[stack.peek()] <arr[i]){
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            arr[stack.pop()] = -1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<n; i++){
            stringBuilder.append(arr[i]+" ");
        }
        System.out.println(stringBuilder);
    }
}
