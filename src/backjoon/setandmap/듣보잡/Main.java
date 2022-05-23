package backjoon.setandmap.듣보잡;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        HashSet<String> nhashSet = new HashSet<>();
        HashSet<String> mHashSet = new HashSet<>();
        for(int i=0; i<n; i++){
            nhashSet.add(scanner.next());
        }

        int count =0;
        for(int i=0; i<m; i++){
            String str = scanner.next();
            if(nhashSet.contains(str)){
                count++;
                mHashSet.add(str);
            }
        }

        System.out.println(count);
        mHashSet.stream().sorted().forEach(s-> System.out.println(s));
    }
}
