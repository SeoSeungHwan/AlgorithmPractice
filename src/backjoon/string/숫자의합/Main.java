package backjoon.string.숫자의합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        String s = scanner.next();

        int sum =0;
        for(int i=0; i<n; i++){
            sum+= Character.getNumericValue(s.charAt(i));
        }
        System.out.println(sum);
    }
}
