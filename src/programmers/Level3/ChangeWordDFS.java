package programmers.Level3;

//https://programmers.co.kr/learn/courses/30/lessons/43163
//DFS - 단어 변환

class ChangeWordDFS {

    static boolean[] visited;
    static int answer = 0;

    public int changeWordDFS(String begin, String target, String[] words) {

        visited = new boolean[words.length];

        dfs(begin,target,words,0);
        return answer;
    }

    public static void dfs(String begin, String target, String[] words, int count){

        if(begin.equals(target)){
            answer = count;
            return;
        }

        for(int i=0; i<words.length; i++){
            if(visited[i]){
                continue;
            }
            int num=0;
            for(int j=0; j<begin.length(); j++){
                if(begin.charAt(j) == words[i].charAt(j)){
                    num++;
                }
            }

            if(num == begin.length() -1){
                visited[i] = true;
                dfs(words[i] , target, words, count+1);
                visited[i] = false;
            }
        }
    }
}