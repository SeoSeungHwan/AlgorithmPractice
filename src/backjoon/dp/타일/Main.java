package backjoon.dp.타일;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        long[] memory = new long[n+1];

        if(n==0){
            System.out.println(0);
        }else if(n ==1){
            System.out.println(1);
        }else{
            memory[1] = 1;
            memory[2] = 2;

            for(int i=3; i<=n; i++){
                memory[i] = (memory[i-1] + memory[i-2]) % 15746;
            }

            System.out.println(memory[n]);
        }
    }
}
