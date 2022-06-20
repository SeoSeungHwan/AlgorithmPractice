package backjoon.greedy.잃어버린괄호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int answer= Integer.MAX_VALUE;
        String[] strArr = scanner.nextLine().split("-");

        for(int i=0; i<strArr.length; i++){
            int sum =0;
            String[] arr = strArr[i].split("\\+");

            for(int j=0; j<arr.length; j++){
                sum += Integer.parseInt(arr[j]);
            }

            if (answer == Integer.MAX_VALUE) {
                answer = sum;
            } else {
                answer -= sum;
            }
        }
        System.out.println(answer);
    }
}
