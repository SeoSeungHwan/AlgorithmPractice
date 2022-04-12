package programmers.Level1;

import java.util.*;

//월간 코드 챌린지1 - 두 개 뽑아서 더하기
//https://programmers.co.kr/learn/courses/30/lessons/68644

public class Pick2Number {
    public int[] pick2number(int[] numbers) {

        int[] numarr = numbers;

        HashSet<Integer> hashset = new HashSet<>();

        for(int i=0; i<numarr.length-1 ; i++){
            for(int j=i+1 ; j < numarr.length ; j++){
                hashset.add(numbers[i]+numbers[j]);
            }
        }

        int index =0;
        int[] arr = new int[hashset.size()];
        for(Integer i : hashset){
            arr[index++] = i;
        }

        Arrays.sort(arr);
        return arr;
    }
}
