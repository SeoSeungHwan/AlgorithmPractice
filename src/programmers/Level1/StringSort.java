package programmers.Level1;

//연습문제 - 문자열 내 마음대로 정렬하기
//https://programmers.co.kr/learn/courses/30/lessons/12915

import java.util.*;
public class StringSort {
    public String[] stringsort(String[] strings, int n) {
        String[] answer = strings;
        for(int i=0; i<answer.length; i++){
            answer[i] = answer[i].charAt(n)+answer[i].substring(0,n)+answer[i].substring(n+1);
        }

        Arrays.sort(answer);
        System.out.println(answer[0]);
        for(int i=0; i<answer.length; i++){
            answer[i] = answer[i].substring(1,n+1)+answer[i].charAt(0)+answer[i].substring(n+1);
        }

        return answer;
    }
}
