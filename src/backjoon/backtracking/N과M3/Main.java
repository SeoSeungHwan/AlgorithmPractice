package backjoon.backtracking.N과M3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static StringBuilder stringBuilder;
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer( bufferedReader.readLine());
        stringBuilder = new StringBuilder();
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        visited = new boolean[n];

        int[] arr = new int[m];

        backTracking(0,n,m,arr);
        System.out.println(stringBuilder);
    }

    public static void backTracking(int depth,int n, int m,int[] arr){
        if(depth == m){
            for (int i=0; i<arr.length; i++){
                stringBuilder.append(arr[i]+" ");
            }
            stringBuilder.append('\n');
            return;
        }

        for(int i=0; i<n; i++){
            if(!visited[i]){
                arr[depth] = i+1;
                backTracking(depth+1,n,m,arr);
            }
        }
    }
}