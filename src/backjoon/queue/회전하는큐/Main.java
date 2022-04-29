package backjoon.queue.회전하는큐;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int answer =0;

        int[] arr = new int[m];
        for(int i=0; i<m ; i++){
            arr[i] = scanner.nextInt();
        }

        LinkedList<Integer> deque = new LinkedList<>();
        for(int i=1; i<=n; i++){
            deque.offer(i);
        }

        for(int i=0; i<m; i++){
            int find_index = deque.indexOf(arr[i]);
            int half_index;

            if(deque.size() % 2 == 0) {
                half_index = deque.size() / 2 - 1;
            }
            else {
                half_index = deque.size() / 2;
            }

            if(find_index <= half_index){
                for(int j=0; j<find_index; j++){
                    deque.offerLast(deque.pollFirst());
                    answer++;
                }
            }else{
                for(int j=0; j<deque.size()-find_index; j++){
                    deque.offerFirst(deque.pollLast());
                    answer++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(answer);

    }
}
