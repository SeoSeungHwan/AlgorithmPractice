package backjoon.dp.연속합;

import java.util.Scanner;

public class Main {

    public static Integer[] dp;
    public static int[] arr;
    public static int max;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        dp = new Integer[n];

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        dp[0] = arr[0];
        max = arr[0];

        sum(n - 1);
        System.out.println(max);
    }

    public static int sum(int n) {
        if (dp[n] == null) {
            dp[n] = Math.max(sum(n - 1) + arr[n], arr[n]);

            max = Math.max(dp[n], max);
        }
        return dp[n];
    }
}
