package programmers.Level3;

//https://programmers.co.kr/learn/courses/30/lessons/42627
//힙 - 디스크 컨트롤러

import java.util.*;

class DiskController {
    public int diskController(int[][] jobs) {
        int answer = 0;
        int time =0;
        int progress_index =0;
        int finish_count =0;

        //요청시간 오름차순 정렬
        Arrays.sort(jobs,(j1,j2) -> j1[0] -j2[0]);

        //처리시간 오름차순으롲 정렬하는 우선순위 큐 생성
        PriorityQueue<int[]> queue = new PriorityQueue<>((j1,j2) -> j1[1] - j2[1]);

        while(finish_count < jobs.length){
            while(progress_index <jobs.length && jobs[progress_index][0] <= time){
                queue.add(jobs[progress_index++]);
            }

            //큐가 비어있다면 시작한 시간 저장하기
            if(queue.isEmpty()){
                time = jobs[progress_index][0];

            }
            //비어있지 않다면(작업을 처리해야할것이 있다면)
            else{
                //큐에 있는 것 중 요청시간 가장 짧은것 가져오기
                int[] tmp = queue.poll();
                answer += time -tmp[0] + tmp[1];
                time += tmp[1];
                finish_count++;
            }
        }
        return (int)Math.floor(answer/jobs.length);
    }
}