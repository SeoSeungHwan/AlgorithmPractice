package backjoon.numbertheory.약수;

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

        if(n==1){
            System.out.println(arr[0]*arr[0]);
        }else if(n==2){
            System.out.println(arr[0]*arr[1]);
        }else if(n%2==1){
            System.out.println(arr[(n/2)]*arr[n/2]);
        }
        else{
            System.out.println(arr[(n/2)-1]*arr[n/2]);
        }
    }
}
