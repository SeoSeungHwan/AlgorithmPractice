package backjoon.setandmap.서로다른부분문자열의개수;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        HashSet<String> hashSet = new HashSet<>();

        int l = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <str.length()-l+1;j++) {
                String s = str.substring(j, j + l);
                hashSet.add(s);
            }
            l++;
        }

        System.out.println(hashSet.size());
    }
}
