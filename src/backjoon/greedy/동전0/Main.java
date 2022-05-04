package backjoon.greedy.동전0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        int count = 0;
        for (int i = n - 1; i >= -1; i--) {
            if(sum == m){
                System.out.println(count);
                break;
            }
            while (true) {
                if (sum + arr[i] <= m) {
                    sum += arr[i];
                    count++;
                } else {
                    break;
                }
            }
        }
    }
}
