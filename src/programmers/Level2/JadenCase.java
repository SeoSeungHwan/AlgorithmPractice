package programmers.Level2;

//https://programmers.co.kr/learn/courses/30/lessons/12951
//연습문제 - JadenCase 문자열 만들기

class JadenCase {
    public String jadencase(String s) {
        String answer = "";
        String[] arr = s.toLowerCase().split("");

        boolean check = true;
        for(String str : arr){
            if(check){
                answer = answer + str.toUpperCase();
            }else{
                answer = answer + str;
            }

            if(str.equals(" ")){
                check = true;
            }else{
                check = false;
            }

        }
        return answer;
    }
}