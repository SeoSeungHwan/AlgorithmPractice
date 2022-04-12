package programmers.Level2;

//https://programmers.co.kr/learn/courses/30/lessons/43165
//깊이,너비 우선탐색(DFS/BFS) - 타켓넘버

public class TargetNumberBFS {
    public int targetnumberbfs(int[] numbers, int target) {
        int answer = 0;

        answer = bfs(numbers,target,numbers[0],1) + bfs(numbers,target,-numbers[0],1);

        return answer;
    }
    public int bfs(int[] numbers , int target , int sum , int i){
        if(i == numbers.length){
            if(sum == target){
                return 1;
            }else{
                return 0;
            }
        }

        int num = 0;
        num += bfs(numbers,target, sum+numbers[i], i+1);
        num += bfs(numbers,target,sum-numbers[i],i+1);
        return num;
    }
}
