package programmers.Level2;

//https://programmers.co.kr/learn/courses/30/lessons/42885#
//탐욕법 - 구명보트

import java.util.*;

class Boat {
    public int boat(int[] people, int limit) {
        int answer = 0;

        int[] arr = people;
        Arrays.sort(arr);

        int front =0;
        for(int end = arr.length-1; front <= end ; end--){
            if(arr[front] + arr[end] <= limit){
                front++;
            }
            answer++;
        }
        return answer;
    }
}
