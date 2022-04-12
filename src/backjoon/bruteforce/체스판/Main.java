package backjoon.bruteforce.체스판;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] board = new int[n][m];
        for (int i = 0; i < n; i++) {
            String column = scanner.next();
            for (int j = 0; j < m; j++) {
                if (column.charAt(j) == 'W') {
                    board[i][j] = 1;
                } else {
                    board[i][j] = -1;
                }
            }
        }

        //1 : 백, -1 : 흑
        int min = n*m;
        for (int i = 0; i + 7 < n; i++) {
            for (int j = 0; j + 7 < m; j++) {

                int color = board[i][j];
                int change =0;
                for (int z = i; z < i+8; z++) {
                    for (int k = j; k < j+8; k++) {
                        if ((z+k)%2 ==0) {
                            if (board[z][k] !=color) {
                                change++;
                            }
                        }else {
                            if(board[z][k] ==color){
                                change++;
                            }
                        }
                    }
                }
                min = Math.min(min,change);
            }
        }

        for (int i = 0; i + 7 < n; i++) {
            for (int j = 0; j + 7 < m; j++) {

                int color = board[i][j];
                int change =0;
                for (int z = i; z < i+8; z++) {
                    for (int k = j; k < j+8; k++) {
                        if ((z+k)%2 ==0) {
                            if (board[z][k] ==color) {
                                change++;
                            }
                        }else {
                            if(board[z][k] !=color){
                                change++;
                            }
                        }
                    }
                }
                min = Math.min(min,change);
            }
        }
        System.out.println(min);
    }
}
