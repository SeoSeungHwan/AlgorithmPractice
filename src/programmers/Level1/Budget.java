package programmers.Level1;

//https://programmers.co.kr/learn/courses/30/lessons/12982
//Summer/Winter Coding(~2018) - 예산

import java.util.*;

class Budget {
    public int budget(int[] d, int budget) {
        int answer = 0;

        int[] arr = d;
        Arrays.sort(arr);

        int sum=0;
        for(int i=0; i<arr.length; i++){

            sum += arr[i];
            if(sum > budget){
                break;
            }
            answer++;

        }
        return answer;
    }
}
