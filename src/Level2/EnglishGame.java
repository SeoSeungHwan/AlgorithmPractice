package Level2;

//https://programmers.co.kr/learn/courses/30/lessons/12981
//Summer/Winter Coding(2018) - 영어 끝말잇기

import java.util.*;

class EnglishGame {
    public int[] englishgame(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> arrayList = new ArrayList<String>();
        boolean flag = true;

        for(int i=0; i<words.length; i++){
            //이전에 나왔던 단어인지 확인
            if(arrayList.contains(words[i])){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                flag = false;
                break;
            }

            arrayList.add(words[i]);

            //끝말잇기 규칙이 일치하지않은경우
            if(i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                flag = false;
                break;
            }
        }
        //탈락자가 발생하지 않았을 때
        if(flag) {
            return new int[]{0, 0};
        }
        return answer;
    }
}