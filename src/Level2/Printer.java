package Level2;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42587
//스택,큐 - 프린터

class Document{
    public int id;
    public int priority;

    Document(int id , int priority){
        this.id = id;
        this.priority = priority;
    }
}

class Printer {
    public int printer(int[] priorities, int location) {
        int answer = 1;

        Queue<Document> queue = new LinkedList<>();
        for(int i=0; i<priorities.length; i++){
            queue.offer(new Document(i,priorities[i]));
        }

        while(!queue.isEmpty()){
            Document d = queue.remove();
            boolean check = true;
            for(Document g :queue){
                if(g.priority > d.priority){
                    check = false;
                }
            }

            if(check){
                if(d.id == location){
                    return answer;
                }else{
                    answer++;
                }
            }else{
                queue.offer(new Document(d.id,d.priority));
            }
        }
        return answer;
    }
}