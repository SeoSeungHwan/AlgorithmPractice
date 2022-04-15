package backjoon.backtracking.N과M1;

import java.util.Scanner;

public class Main {
    static boolean[] visited;
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        visited = new boolean[n];

        int[] arr = new int[m];

        backTracking(0,n,m,arr);

    }

    public static void backTracking(int depth,int n, int m,int[] arr){
        if(depth == m){
           for (int i=0; i<arr.length; i++){
               System.out.print(arr[i]+" ");
           }
            System.out.println();
            return;
        }

        for(int i=0; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i+1;
                backTracking(depth+1,n,m,arr);

                visited[i] = false;
            }
        }
    }
}
