package backjoon.string.문자열반복;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i=0 ; i<n ; i++){
            int count = scanner.nextInt();
            String str = scanner.next();

            StringBuilder stringBuilder = new StringBuilder();
            for(int j=0;j<str.length();j++){
                for(int k=0;k<count;k++){
                    stringBuilder.append(str.charAt(j));
                }
            }

            System.out.println(stringBuilder);
        }
    }
}
