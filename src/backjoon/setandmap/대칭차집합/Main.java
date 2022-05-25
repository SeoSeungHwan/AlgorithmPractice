package backjoon.setandmap.대칭차집합;

import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        HashSet<Integer> hashSet1 = new HashSet<Integer>();
        HashSet<Integer> hashSet2 = new HashSet<Integer>();

        for(int i=0; i<n; i++){
            hashSet1.add(scanner.nextInt());
        }
        for(int i=0; i<m; i++){
            hashSet2.add(scanner.nextInt());
        }

        int sum =0;
        AtomicInteger count = new AtomicInteger();
        hashSet1.stream().forEach( i -> {
            if(hashSet2.contains(i)){
                count.getAndIncrement();
            }
        });
        sum=m- count.get();

        count.set(0);
        hashSet2.stream().forEach( i -> {
            if(hashSet1.contains(i)){
                count.getAndIncrement();
            }
        });
        sum+= n- count.get();

        System.out.println(sum);
    }
}
