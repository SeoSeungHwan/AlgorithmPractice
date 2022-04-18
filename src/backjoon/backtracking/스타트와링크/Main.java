package backjoon.backtracking.스타트와링크;

import java.util.Scanner;

public class Main {
    public static int MIN = Integer.MAX_VALUE;
    public static int[][] arr;
    public static int N;
    public static boolean[] visited;
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        N = scanner.nextInt();

        arr = new int[N][N];
        visited = new boolean[N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        backTracking(0,0);

        System.out.println(MIN);
    }
    public static void backTracking(int count, int index){

        if(count == N/2){
            check();
            return ;
        }

        for(int i=index; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                backTracking(count+1, i+1);
                visited[i] = false;
            }
        }
    }

    public static void check(){
        int team_A =0;
        int team_B =0;

        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(visited[i] ==true && visited[j] == true){
                    team_A += arr[i][j] + arr[j][i];
                }
                else if(visited[i] ==false && visited[j] == false){
                    team_B += arr[i][j] + arr[j][i];
                }
            }
        }

        int answer = Math.abs(team_A-team_B);
        if(answer ==0){
            System.out.println(answer);
            System.exit(0);
        }

        MIN = Math.min(MIN,answer);
    }
}
