package backjoon.string.알파벳찾기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        String s = scanner.nextLine();

        int[] count = new int[26];
        for(int i=0; i<count.length;i++){
            count[i] = -1;
        }
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i) - 'a';
            if(count[index] == -1){
                count[index] = i;
            }
        }

        for(int i=0; i<count.length;i++){
            System.out.print(count[i]+" ");
        }
    }
}
