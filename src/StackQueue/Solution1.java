package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {
    public int solution1(int bridge_length, int weight, int[] truck_weights) {

        int answer = 0;

        Queue<Integer> standByQueue =
                new LinkedList<>();
        Queue<Integer> bridgeQueue = new LinkedList<>();
        Queue<Integer> completeQueue = new LinkedList<>();

        for(int i=0 ; i<truck_weights.length ; i++){
            standByQueue.offer(truck_weights[i]);
        }

        int sum =0;
        while(!standByQueue.isEmpty()){
            if(bridgeQueue.size() == bridge_length){

                sum = sum - bridgeQueue.peek();
                completeQueue.offer(bridgeQueue.poll());
            }
            if(sum+standByQueue.peek() <= weight){
                sum = sum + standByQueue.peek();
                bridgeQueue.offer(standByQueue.poll());
            }else{
                bridgeQueue.offer(0);
            }

            answer++;
        }

        return answer+bridge_length;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] arr = {7,4,5,6};
        System.out.println(solution1.solution1(2,10,arr));
    }
}
