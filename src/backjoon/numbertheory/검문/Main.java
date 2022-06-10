package backjoon.numbertheory.검문;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        int answer = arr[1] - arr[0];

        for(int i=2; i<n ; i++){
            answer = gcd(answer,arr[i]-arr[i-1]);
        }

        for(int i=2; i<=answer; i++){
            if(answer %i ==0){
                System.out.print(i+" ");
            }
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
