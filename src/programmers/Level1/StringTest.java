package programmers.Level1;

//https://programmers.co.kr/learn/courses/30/lessons/12918
//연습문제 - 문자열다루기
public class StringTest {
    public boolean stringtest(String s) {
        boolean answer = true;

        char[] arr = s.toCharArray();

        if(!(arr.length ==4 || arr.length == 6)){
            return false;
        }
        for(int i=0 ; i<arr.length; i++){
            if('0'<=arr[i] && arr[i]<='9'){
                continue;
            }else{
                return false;
            }
        }
        return answer;
    }
}
