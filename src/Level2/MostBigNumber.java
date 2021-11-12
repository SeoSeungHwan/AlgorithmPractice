package Level2;

//정렬- 가장 큰 수
//https://programmers.co.kr/learn/courses/30/lessons/42746


import java.util.*;

class MostBigNumber {

    public String mostbignumber(int[] numbers) {
        String answer = "";

        ArrayList<String> arr = new ArrayList<>();
        for(int i : numbers){
            arr.add(i+"");
        }

        Collections.sort(arr,(a,b) -> (b+a).compareTo(a+b));

        if(arr.get(0).startsWith("0")) {
            return "0";
        }

        for(String s : arr){
            answer += s;
        }

        return answer;
    }

}
