package backjoon.sort.나이순정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[][] arr = new String[n][2];
        for(int i=0; i<n; i++){
            String s = scanner.nextLine();
            arr[i][0] = s.split(" ")[0];
            arr[i][1] = s.split(" ")[1];
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
            }
        });

        for(int i=0; i<n; i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}
