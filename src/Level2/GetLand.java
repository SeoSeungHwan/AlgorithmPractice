package Level2;

//https://programmers.co.kr/learn/courses/30/lessons/12913
//연습문제 - 땅따먹기

import java.util.*;
class GetLand {
    int getland(int[][] land) {

        for(int i=1; i<land.length; i++){
            land[i][0] += Math.max(Math.max(land[i-1][1],land[i-1][2]),land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0],land[i-1][2]),land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][0],land[i-1][1]),land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][0],land[i-1][1]),land[i-1][2]);
        }

        int[] arr = land[land.length-1];
        Arrays.sort(arr);

        return arr[arr.length-1];
    }
}
