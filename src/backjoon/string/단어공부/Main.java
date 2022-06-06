package backjoon.string.단어공부;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        String s = scanner.nextLine().toUpperCase();

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) -'A' ;
            count[num]++;
        }

        int max = 0;
        char answer = '?';
        for (int i = 0; i < count.length; i++) {
            if(max < count[i]){
                max = count[i];
                answer = (char)(i+'A');
            } else if (max == count[i]){
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
