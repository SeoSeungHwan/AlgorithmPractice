package programmers.Level2;

//https://programmers.co.kr/learn/courses/30/lessons/17677
//2018 KAKAO BLIND RECRUITMENT - 1차 뉴스클러스터링

import java.util.*;
public class NewsClustering {
    public int newsclustering(String str1, String str2) {

        //대문자 소문자 차이 없애기
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();


        ArrayList<String> s1ArrayList = new ArrayList<>();
        ArrayList<String> s2ArrayList = new ArrayList<>();

        //s1 두글자씩 끊어서 글자만 arrayList에 저장
        for(int i=0;i<s1.length()-1; i++){
            String twoString = s1.substring(i,i+2);
            //만약 영문자만 있다면
            if(twoString.matches("^[a-zA-Z]*$")){
                s1ArrayList.add(twoString);
            }
        }

        //s2 두글자씩 끊어서 글자만 arrayList에 저장
        for(int i=0;i<s2.length()-1; i++){
            String twoString = s2.substring(i,i+2);
            //만약 영문자만 있다면
            if(twoString.matches("^[a-zA-Z]*$")){
                s2ArrayList.add(twoString);
            }
        }

        int same =0;

        //두 집합의 교집합 찾기
        if(s1ArrayList.size()< s2ArrayList.size()){
            for(int i=0; i< s1ArrayList.size(); i++){
                if(s2ArrayList.contains(s1ArrayList.get(i))){
                    s2ArrayList.remove(s1ArrayList.get(i));
                    same++;
                }

            }
        }else{
            for(int i=0; i< s2ArrayList.size(); i++){
                if(s1ArrayList.contains(s2ArrayList.get(i))){
                    s1ArrayList.remove(s2ArrayList.get(i));
                    same++;
                }
            }
        }

        //만약 공집합이면 1* 65536 리턴
        if(s2ArrayList.size()==0 && s1ArrayList.size()==0){
            return 65536;
        }
        //둘다 공집합이 아니라면
        else{
            double num = (double)same/(s1ArrayList.size()+ s2ArrayList.size());
            return (int)(num*65536);
        }
    }
}
