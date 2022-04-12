package programmers.Level3;

//https://programmers.co.kr/learn/courses/30/lessons/42628
//힙 - 이중우선순위 큐

import java.util.*;

class TwicePriorityQueue {
    public int[] twicePriorityQueue(String[] operations) {
        int[] answer = new int[2];

        PriorityQueue<Integer> min_queue = new PriorityQueue<>();
        PriorityQueue<Integer> max_queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<operations.length;i++){
            if(operations[i].equals("D 1")){
                if(!max_queue.isEmpty()){
                    int num = max_queue.poll();
                    System.out.println("최대값 제거 :"+num);
                    min_queue.remove(num);
                }
            }else if(operations[i].equals("D -1")){
                if(!min_queue.isEmpty()){
                    int num = min_queue.poll();
                    System.out.println("최소값 제거 :"+num);
                    max_queue.remove(num);
                }
            }else{
                int num = Integer.parseInt(operations[i].split(" ")[1]);
                System.out.println("삽입 :"+num);
                min_queue.add(num);
                max_queue.add(num);
            }

            //큐가 비어있지않다면 answer값 변경
            if(!min_queue.isEmpty() && !max_queue.isEmpty()){
                answer[0] = max_queue.peek();
                answer[1] = min_queue.peek();
            }else{
                //큐가 비어있다면
                answer[0] =0;
                answer[1] =0;
            }
        }
        return answer;
    }
}