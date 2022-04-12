package programmers.Level1;

//https://programmers.co.kr/learn/courses/30/lessons/12925
//연습문제 - 문자열을 정수로 바꾸기
public class StringToInt {
    public int stringtoInt(String s) {

        String str = s.replaceAll("[^0-9]","");

        if(s.charAt(0) == '-'){
            return Integer.parseInt(str) * -1;
        }else{
            return Integer.parseInt(str);
        }
    }
}
