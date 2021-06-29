package Kakao;

//2019 KAKAO BLIND RECRUITMENT - 오픈 채팅방
//https://programmers.co.kr/learn/courses/30/lessons/42888

import java.util.*;
class Solution {
    public String[] solution(String[] record) {


        HashMap<String,String> map = new HashMap<>();
        int change =0;
        for(int i=0; i<record.length; i++){
            if((record[i].split(" ")[0]).equals("Enter")){
                String id = record[i].split(" ")[1];
                String name = record[i].split(" ")[2];
                map.put(id,name);
            }
            else if((record[i].split(" ")[0]).equals("Change")){
                String id = record[i].split(" ")[1];
                String name = record[i].split(" ")[2];
                change++;
                map.put(id,name);
            }
        }

        String[] answer = new String[record.length - change];
        int index =0;
        for(int j=0 ;j<record.length;j++){
            if((record[j].split(" ")[0]).equals("Enter")){
                answer[index++] = map.get(record[j].split(" ")[1])+"님이 들어왔습니다.";
            }
            else if((record[j].split(" ")[0]).equals("Leave")){
                answer[index++] = map.get(record[j].split(" ")[1])+"님이 나갔습니다.";
            }
        }
        return answer;
    }
}