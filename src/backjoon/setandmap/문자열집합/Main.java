package backjoon.setandmap.문자열집합;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        HashSet<String> hashSet = new HashSet<>();
        for(int i=0; i<n; i++){
            hashSet.add(scanner.next());
        }

        int count =0;
        for(int i=0; i<m; i++){
            if(hashSet.contains(scanner.next())){
                count++;
            }
        }

        System.out.println(count);
    }
}
