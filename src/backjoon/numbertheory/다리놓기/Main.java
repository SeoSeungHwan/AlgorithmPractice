package backjoon.numbertheory.다리놓기;

import java.util.Scanner;

public class Main {
    static int[][] dp = new int[30][30];
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int count = scanner.nextInt();

        for(int i=0; i<count; i++){
            int n = scanner.nextInt();
            int r = scanner.nextInt();

            System.out.println(combination(r,n));
        }
    }

    public static int combination(int n, int r){
        if(dp[n][r] >0){
            return dp[n][r];
        }

        if(n==r || r==0) {
            return dp[n][r] = 1;
        }else{
            return dp[n][r] = combination(n-1,r-1) + combination(n-1,r);
        }
    }
}
