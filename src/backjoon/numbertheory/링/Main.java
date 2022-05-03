package backjoon.numbertheory.링;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int m = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>=m){
                System.out.println(m/gcd(arr[i],m)+"/"+arr[i]/gcd(arr[i],m));
            }else{
                System.out.println(m/gcd(m,arr[i])+"/"+arr[i]/gcd(m,arr[i]));
            }
        }
    }
    public static int gcd(int n, int m) {
        if (n % m == 0) {
            return m;
        }
        return gcd(m, n % m);
    }
}
