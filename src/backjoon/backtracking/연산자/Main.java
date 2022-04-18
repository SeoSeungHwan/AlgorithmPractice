package backjoon.backtracking.연산자;

import java.util.Scanner;

public class Main {
    public static int MAX = Integer.MIN_VALUE;
    public static int MIN = Integer.MAX_VALUE;
    public static int N;
    public static int[] numbers;
    public static int[] operators = new int[4];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            operators[i] = scanner.nextInt();
        }

        backTracking(numbers[0],1);

        System.out.println(MAX);
        System.out.println(MIN);

    }

    public static void backTracking(int num, int index) {
        if (index == N) {
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;

                switch (i) {
                    case 0:
                        backTracking(num + numbers[index], index + 1);
                        break;
                    case 1:
                        backTracking(num - numbers[index], index + 1);
                        break;
                    case 2:
                        backTracking(num * numbers[index], index + 1);
                        break;
                    case 3:
                        backTracking(num / numbers[index], index + 1);
                        break;
                }
                operators[i]++;
            }
        }
    }
}
