package backjoon.backtracking.N퀸;

import java.util.Scanner;

public class Main {

    static boolean[] visited;
    static int[]board;
    static int answer =0;
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        visited = new boolean[n];
        board = new int[n];

        backTracking(0);
        System.out.println(answer);

    }

    public static void backTracking(int depth){
        //퀸의 개수가 n개이면 리턴 , 방법의 수 +1
        if(depth == board.length){
            answer++;
            return;
        }

        for(int i=0; i<board.length; i++){
            if(!visited[i]){
                visited[i] = true;

                board[depth] = i;

                if(checkQueen(depth)){
                    backTracking(depth+1);
                }
                visited[i] = false;
            }
        }
    }

    public static boolean checkQueen(int depth){

        for(int i=0; i<depth; i++){
            //같은 행에 있다면 false
            if(board[depth] == board[i]){
                return false;
            }

            //대각선에 있다면 false
            if(Math.abs(i-depth) == Math.abs(board[depth] - board[i])){
                return false;
            }
        }
        return true;
    }
}
