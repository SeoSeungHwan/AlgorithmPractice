package backjoon.numbertheory.최대공약수와최소공배수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int answer1 = 0;
        int answer2 = 0;
        if (n >= m) {
            answer1 = gcd(n,m);
        }else{
            answer1 = gcd(m,n);
        }
        answer2 = (n*m)/answer1;

        System.out.println(answer1);
        System.out.println(answer2);
    }

    public static int gcd(int n, int m) {
        if (n % m == 0) {
            return m;
        }
        return gcd(m, n % m);
    }
}
