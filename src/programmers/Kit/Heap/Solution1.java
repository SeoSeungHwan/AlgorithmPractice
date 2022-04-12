package programmers.Kit.Heap;

import java.util.PriorityQueue;

//https://programmers.co.kr/learn/courses/30/lessons/42626
//힙 더맵게
public class Solution1 {
    public int solution1(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for(int i=0; i<scoville.length;i++){
            minHeap.add(scoville[i]);
        }
        int num =0;
        for(int j =0 ; j<scoville.length-1;j++){
            if(minHeap.peek()>=K){
                return answer;
            }
            num = minHeap.poll()+(2*minHeap.poll());
            minHeap.add(num);
            answer++;
        }
        if(minHeap.peek()<K){
            return -1;
        }
        return answer;
    }

}
