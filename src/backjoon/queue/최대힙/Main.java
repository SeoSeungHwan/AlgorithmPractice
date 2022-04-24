package backjoon.queue.최대힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(bufferedReader.readLine());
            if(num==0){
                if(priorityQueue.isEmpty()){
                    stringBuilder.append("0"+"\n");
                }else{
                    stringBuilder.append(priorityQueue.remove()+"\n");
                }
            }else{
                priorityQueue.add(num);
            }
        }

        System.out.println(stringBuilder);
    }
}
