package Level1;

//https://programmers.co.kr/learn/courses/30/lessons/12910
//연습문제 - 나누어 떨어지는 숫자 배열

import java.util.*;

class DivideZero {
    public int[] dividezeroint(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int index = 0;

        for(int i=0  ;i<arr.length; i++){
            if(arr[i] %divisor ==0){
                answer[index++] = arr[i];
            }
        }

        int[] newAnswer = new int[index];
        for(int i=0 ; i<index; i++){
            newAnswer[i] = answer[i];
        }

        int[] a = {-1};
        if(index ==0){
            return a;
        }else{
            Arrays.sort(newAnswer);
            return newAnswer;
        }
    }
}
