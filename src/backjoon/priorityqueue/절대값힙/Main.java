package backjoon.priorityqueue.절대값힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int abs1 = Math.abs(o1);
                int abs2 = Math.abs(o2);

                if(abs1 == abs2) {
                    return o1 > o2 ? 1 : -1;
                }
                return abs1 - abs2;
            }
        });

        for(int i=0; i<n ; i++){
            int num = Integer.parseInt(bufferedReader.readLine());
            if(num !=0){
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
