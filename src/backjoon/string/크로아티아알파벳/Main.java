package backjoon.string.크로아티아알파벳;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String str = scanner.next();

        for(int i=0; i<arr.length; i++){
            str = str.replace(arr[i],"#");
        }

        System.out.println(str.length());
    }
}
