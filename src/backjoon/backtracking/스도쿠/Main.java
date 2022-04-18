package backjoon.backtracking.스도쿠;

import java.util.Scanner;

public class Main {
    static int[][] arr;
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        arr = new int[9][9];
        for(int i=0; i<9;i++){
            for(int j=0; j<9; j++){
                arr[i][j]=scanner.nextInt();
            }
        }

        backTracking(0,0);

    }

    public static void backTracking(int row, int col){

        if(col ==9){
            backTracking(row+1,0);
            return;
        }

        if(row==9){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0; i<9;i++){
                for(int j=0; j<9;j++){
                    stringBuilder.append(arr[i][j]+" ");
                }
                stringBuilder.append("\n");
            }
            System.out.println(stringBuilder);
            System.exit(0);
        }

        if(arr[row][col] == 0){
            for(int i=1; i<=9; i++){
                if(check(row,col,i)){
                    arr[row][col] =i;
                    backTracking(row,col+1);
                }
            }
            arr[row][col] =0;
            return;
        }
        backTracking(row,col+1);
    }

    public static boolean check(int row, int col, int value){
        for(int i=0; i<9; i++){
            if(arr[row][i] == value){
                return false;
            }
        }

        for(int i=0; i<9; i++){
            if(arr[i][col] == value){
                return false;
            }
        }

        int first_row = (row/3) *3;
        int first_col = (col/3) *3;
        for(int i=first_row; i<first_row+3;i++){
            for(int j=first_col;j<first_col+3;j++){
                if(arr[i][j] == value){
                    return false;
                }
            }
        }
        return true;
    }
}
