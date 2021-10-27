package Level2;

//https://programmers.co.kr/learn/courses/30/lessons/87946?language=java
//위클리 챌린지 12주차 - 피로도

class Dungeons {
    public static int dungeons;
    public static boolean[] visit;
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        visit = new boolean[dungeons.length];
        dfs(k,dungeons,0);

        return answer;
    }

    public void dfs(int hp ,int[][] dungeions, int count){
        for(int i=0; i< dungeions.length; i++){
            if(visit[i]==false && dungeions[i][0] <= hp){
                visit[i] =true;
                dfs(hp - dungeions[i][1],dungeions,count+1);
                visit[i] =false;
            }
        }
        if(answer < count){
            answer = count;
        }
    }
}