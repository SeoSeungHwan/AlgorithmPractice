package backjoon.numbertheory.배수와약수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        while(true){
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            if(n ==0 && m ==0){
                break;
            }
            System.out.println(check(n,m));
        }
    }

    public static String check(int n, int m){
        if(n%m ==0){
            return "multiple";
        }else if(m%n ==0){
            return "factor";
        }else{
            return "neither";
        }
    }
}
