package backjoon.numbertheory.이항계수1;

import java.util.Scanner;

public class Main {

    public static int[][] dp;
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        dp = new int[n+1][k+1];

        System.out.println(pascal(n,k));
    }

    //팩토리얼
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    //파스칼의 정리 , dp(동적계획법 사용)
    public static int pascal(int n, int k){
        if(dp[n][k] >0){
            return dp[n][k];
        }

        if(n ==k || k==0){
            return dp[n][k] = 1;
        }else{
            return dp[n][k] = pascal(n-1,k-1) + pascal(n-1,k);
        }
    }
}