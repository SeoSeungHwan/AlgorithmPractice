package backjoon.greedy.atm;

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
        int answer =0;
        int sum =0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            answer += sum;
        }
        System.out.println(answer);
    }
}
