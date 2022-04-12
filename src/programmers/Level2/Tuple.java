package programmers.Level2;

//https://programmers.co.kr/learn/courses/30/lessons/64065
//2019 카카오 개발자 겨울 인턴쉽 - 튜플

import java.util.*;
public class Tuple {
    class Solution {
        public int[] solution(String s) {

            //양쪽끝의 { } 을 없애기
            String str = s.substring(2,s.length()-2);
            //},{ 을 다른것으로 변경하여 집합을 구분한 후 string 배열에 저장
            str = str.replace("},{","-");
            String[] arr = str.split("-");

            //집합을 길이순대로 정렬
            Arrays.sort(arr,new Comparator<String>(){
                @Override
                public int compare(String s1, String s2){
                    return s1.length() - s2.length();
                }
            });

            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for(String temp : arr){
                //집합안의 원소들 분리
                String[] numArr = temp.split(",");

                //집합안의 원소들을 순서대로 확인하며 존재하지않다면 answer에 추가
                for(int i=0; i<numArr.length ; i++){
                    if(!arrayList.contains(Integer.valueOf(numArr[i]))){
                        arrayList.add(Integer.valueOf(numArr[i]));
                    }
                }
            }


            int[] answer = new int[arrayList.size()];
            for(int i=0;i<arrayList.size();i++){
                answer[i] = arrayList.get(i);
            }
            return answer;
        }
    }
}
