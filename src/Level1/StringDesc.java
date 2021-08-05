package Level1;
import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/12917
//연습문제 - 문자열 내림차순으로 배치하기

public class StringDesc {
    public String stringdesc(String s) {
        String answer = "";

        ArrayList<Character> small = new ArrayList<>();
        ArrayList<Character> big = new ArrayList<>();

        for(int i=0 ; i < s.length(); i++){
            if('a'<= s.charAt(i) && s.charAt(i) <= 'z' ){
                small.add(s.charAt(i));
            }else{
                big.add(s.charAt(i));
            }
        }

        Collections.sort(small,Collections.reverseOrder());
        Collections.sort(big,Collections.reverseOrder());

        for(char c : small){
            answer += c;
        }
        for(char c : big){
            answer += c;
        }

        return answer;
    }
}
