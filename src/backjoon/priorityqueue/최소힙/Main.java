package backjoon.priorityqueue.최소힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i=0; i<n ; i++){
            int num = Integer.parseInt(bufferedReader.readLine());
            if(num >0){
                priorityQueue.add(num);
            }else{
                if(priorityQueue.size()!=0){
                    System.out.println(priorityQueue.poll());
                }else{
                    System.out.println("0");
                }
            }
        }
    }
}
