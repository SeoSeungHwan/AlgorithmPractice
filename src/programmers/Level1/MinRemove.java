package programmers.Level1;

//https://programmers.co.kr/learn/courses/30/lessons/12935
//연습문제 - 제일작은수 제거하기

import java.util.*;

public class MinRemove {
    public int[] minremove(int[] arr) {


        if(arr.length == 1){
            int[] a = {-1};
            return a;
        }

        int min = arr[0];
        for(int i=1 ; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        //arrayList에 최소값 제외하고 모두 저장
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0 ;i<arr.length; i++){
            if(arr[i] != min){
                arrayList.add(arr[i]);
            }
        }

        int[] answer = new int[arrayList.size()];
        int index =0;
        for(int num : arrayList){
            answer[index++] = num;
        }
        return answer;
    }
}
