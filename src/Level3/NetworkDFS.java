package Level3;

//https://programmers.co.kr/learn/courses/30/lessons/43162
//DFS - 네트워크

class NetworkDFS {

    boolean[] visited;

    public int networkDFS(int n, int[][] computers) {
        int answer = 0;

        visited = new boolean[n];

        for(int i=0; i< computers.length; i++){
            if(!visited[i]){
                dfs(computers,i);
                answer++;
            }
        }

        return answer;
    }

    public void dfs(int[][] computers , int index){
        visited[index] = true;
        for(int i=0; i<computers.length; i++){
            if((computers[index][i] ==1) && (index != i) && (visited[i] == false)){
                dfs(computers,i);
            }
        }
        return;
    }
}