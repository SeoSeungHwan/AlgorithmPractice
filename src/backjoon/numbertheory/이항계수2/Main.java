package backjoon.numbertheory.이항계수2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    static int[][] memory;
    public static final int div = 10007;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        memory = new int[n + 1][m + 1];

        System.out.println(BC(n, m));

    }

    static int BC(int n, int k) {

        if (memory[n][k] > 0) {
            return memory[n][k];
        }

        if (k == 0 || n == k) {
            return memory[n][k] = 1;
        }

        return memory[n][k] = (BC(n - 1, k - 1) + BC(n - 1, k)) % div;
    }
}