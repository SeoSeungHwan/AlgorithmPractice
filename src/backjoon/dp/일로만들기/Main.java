package backjoon.dp.일로만들기;

import java.util.Scanner;

public class Main {

    public static Integer[] memory;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        memory = new Integer[n + 1];
        memory[0] = 0;
        memory[1] = 0;
        System.out.println(dp(n));
    }

    public static int dp(int num) {
        if (memory[num] == null) {
            if (num % 6 == 0) {
                memory[num] = Math.min(dp(num - 1), Math.min(dp(num / 3), dp(num / 2))) + 1;
            } else if (num % 3 == 0) {
                memory[num] = Math.min(dp(num / 3), dp(num - 1)) + 1;
            } else if (num % 2 == 0) {
                memory[num] = Math.min(dp(num / 2), dp(num - 1)) + 1;
            } else {
                memory[num] = dp(num - 1) + 1;
            }
        }
        return memory[num];
    }
}
