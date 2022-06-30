package backjoon.dp.계단오르기;

import java.util.Scanner;

public class Main {
    public static Integer[] memory;
    public static int[] arr;
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        memory = new Integer[n+1];
        arr = new int[n+1];

        for(int i=1; i<=n; i++){
            arr[i] = scanner.nextInt();
        }
        memory[0] = arr[0];
        memory[1] = arr[1];

        if(n>=2){
            memory[2] = arr[1]+arr[2];
        }

        System.out.println(dp(n));
    }

    public static int dp(int index){
        if(memory[index] ==null){
            return memory[index] =  Math.max(dp(index-2),dp(index-3)+arr[index-1])+arr[index];
        }
        return memory[index];
    }
}
