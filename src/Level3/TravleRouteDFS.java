package Level3;

//https://programmers.co.kr/learn/courses/30/lessons/43164
//DFS - 여행경로

import java.util.*;

class TravleRouteDFS {

    static boolean[] visited;
    ArrayList<String> arrayList;

    public String[] travleRouteDFS(String[][] tickets) {

        arrayList= new ArrayList<>();
        visited = new boolean[tickets.length];

        dfs("ICN","ICN",tickets,0);

        Collections.sort(arrayList);
        String[] answer = arrayList.get(0).split(" ");

        return answer;
    }

    public void dfs(String start, String route, String[][] tickets, int count ){
        if(count == tickets.length){
            arrayList.add(route);
            return;
        }

        for(int i=0; i<tickets.length; i++){
            if(start.equals(tickets[i][0]) && !visited[i]){
                visited[i] = true;
                dfs(tickets[i][1] , route+" "+tickets[i][1],tickets,count+1);
                visited[i] = false;
            }
        }
    }
}