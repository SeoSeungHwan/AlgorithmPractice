package backjoon.priorityqueue.가운데를말해요;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>((o1,o2)->o1-o2);
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>((o1,o2)->o2-o1);
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(bufferedReader.readLine());
            if(priorityQueue1.size()==priorityQueue2.size()){
                priorityQueue2.add(num);
            }else{
                priorityQueue1.add(num);
            }

            if(!priorityQueue1.isEmpty() && !priorityQueue2.isEmpty()){
                if(priorityQueue1.peek()<priorityQueue2.peek()){
                    int temp = priorityQueue1.poll();
                    priorityQueue1.add(priorityQueue2.poll());
                    priorityQueue2.add(temp);
                }
            }

            stringBuilder.append(priorityQueue2.peek()+"\n");
        }
        System.out.println(stringBuilder);
    }
}
