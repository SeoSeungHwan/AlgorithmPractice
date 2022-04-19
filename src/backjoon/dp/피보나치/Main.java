package backjoon.dp.피보나치;

import java.util.Scanner;

public class Main {
    public static Integer[][] memory = new Integer[41][2];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        memory[0][0] = 1;
        memory[0][1] = 0;
        memory[1][0] = 0;
        memory[1][1] = 1;

        int n = scanner.nextInt();

        StringBuilder stringBuilder = new StringBuilder();

        while(n-- >0){
            int num = scanner.nextInt();
            fibo(num);
            stringBuilder.append(memory[num][0] + " " + memory[num][1]).append('\n');
        }
        System.out.println(stringBuilder);

    }

    public static Integer[] fibo(int num) {
        if (memory[num][0] == null || memory[num][1] == null) {
            memory[num][0] = fibo(num - 1)[0] + fibo(num - 2)[0];
            memory[num][1] = fibo(num - 1)[1] + fibo(num - 2)[1];
        }
        return memory[num];

    }
}
