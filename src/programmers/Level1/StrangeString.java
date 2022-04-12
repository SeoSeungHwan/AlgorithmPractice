package programmers.Level1;

//https://programmers.co.kr/learn/courses/30/lessons/12930
//연습문제 - 이상한 문자 만들기

public class StrangeString {
    public String strangestring(String s) {
        String answer = "";
        String[] str = s.split("");

        int index = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {
                index = 0;
            } else if(index % 2 == 0) {
                str[i] = str[i].toUpperCase();
                index++;
            } else if(index % 2 != 0) {
                str[i] = str[i].toLowerCase();
                index++;
            }
            answer += str[i];
        }

        return answer;
    }
}
