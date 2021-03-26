package Greedy;

import java.util.Arrays;

public class Solution1 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;

        boolean[] check = new boolean[n+1];

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i=0; i<lost.length;i++){
            for(int j=0; j<reserve.length;j++){
                if(lost[i]==reserve[j]){
                    check[reserve[j]] = true;
                    answer++;
                }
            }
        }

        for(int i=0 ; i<lost.length;i++){
            if(!check[lost[i]]){
                for(int j =0; j<reserve.length;j++){
                    if(!check[reserve[j]]){
                        if(reserve[j]==lost[i]-1){
                            answer++;
                            check[reserve[j]]=true;
                            break;
                        }else if(reserve[j]==lost[i]+1){
                            answer++;
                            check[reserve[j]] =true;
                        }else if(reserve[j]> lost[i]+1){
                            break;
                        }
                    }
                }
            }
        }



        return answer;
    }
}
