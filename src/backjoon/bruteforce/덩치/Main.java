package backjoon.bruteforce.덩치;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] people = new int[n][2];
        for(int i=0; i<n; i++){
            people[i][0] = scanner.nextInt();
            people[i][1] = scanner.nextInt();
        }

        int[] count = new int[n];
        for(int i=0; i<n; i++){
            int num =0;
            for(int j=0; j<n; j++){
                 if(i==j){
                     continue;
                 }
                 if(people[i][0] < people[j][0] && people[i][1] <people[j][1]){
                     num++;
                 }
            }
            count[i] = num+1;
        }

        for (int c:count) {
            System.out.print(c+" ");
        }
    }
}
