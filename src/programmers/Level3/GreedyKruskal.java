package programmers.Level3;

//https://programmers.co.kr/learn/courses/30/lessons/42861
//Greedy - 섬 연결하기

import java.util.*;

class GreedyKruskal {

    int[] cycle;
    public int greedyKruskal(int n, int[][] costs) {

        //costs배열 정렬
        Arrays.sort(costs,(a,b) ->  a[2] -b[2]);

        //사이클 테이블 설정
        cycle = new int[n];
        for(int i=0; i<n; i++){
            cycle[i] = i;
        }

        int answer = 0;
        for(int i=0; i<costs.length; i++){
            int from = costs[i][0];
            int to = costs[i][1];
            int cost = costs[i][2];

            int fromParent = findParent(from);
            int toParent = findParent(to);

            //부모가 같으면 해당 간선 선택 x
            if(fromParent == toParent){
                continue;
            }

            answer += cost;
            cycle[toParent] = fromParent;

        }

        return answer;
    }

    //부모 노드찾기
    private int findParent(int node){
        if(cycle[node] == node){
            return node;
        }
        return findParent(cycle[node]);
    }
}

