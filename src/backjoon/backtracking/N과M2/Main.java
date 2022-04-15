package backjoon.backtracking.N과M2;

import java.util.Scanner;

public class Main {
    static boolean[] visited;
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        visited = new boolean[n];

        int[] arr = new int[m];

        backTracking(0,n,m,arr,1);

    }

    public static void backTracking(int depth,int n, int m,int[] arr, int point){
        if(depth == m){
           for (int i=0; i<arr.length; i++){
               System.out.print(arr[i]+" ");
           }
            System.out.println();
            return;
        }

        for(int i=point; i<=n; i++){
                arr[depth] = i;
                backTracking(depth+1,n,m,arr,i+1);
        }
    }
}
