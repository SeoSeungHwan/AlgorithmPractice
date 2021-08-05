package Level1;

//https://programmers.co.kr/learn/courses/30/lessons/12922
//연습문제 - 수박수박수박수박수?
public class WaterMelon {
    public String watermelon(int n) {
        String answer = "";

        String s = "수박";
        char[] c = s.toCharArray();

        for(int i =0 ; i<n ; i++){
            answer+= c[i%2];
        }
        return answer;
    }
}
