package backjoon.queue.요세푸스문제;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=n; i++){
            queue.add(i);
        }

        System.out.print("<");
        while(queue.size() > 1) {
            for(int i = 0; i < m - 1; i++) {
                int val = queue.poll();
                queue.offer(val);
            }
            System.out.print(queue.poll()+", ");
        }

        System.out.print(queue.poll()+">");
    }
}
