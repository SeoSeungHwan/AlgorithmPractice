package backjoon.dp.파도반수열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        long[] memory = new long[101];

        memory[0] = 0;
        memory[1] = 1;
        memory[2] = 1;
        memory[3] = 1;
        memory[4] = 2;
        memory[5] = 2;

        int n = scanner.nextInt();

       for(int i=6; i<=100; i++){
           memory[i] = memory[i-1]+ memory[i-5];
       }

       while(n-->0){
           int num = scanner.nextInt();
           System.out.println(memory[num]);
       }
    }
}
