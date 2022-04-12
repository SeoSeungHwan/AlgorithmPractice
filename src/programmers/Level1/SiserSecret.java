package programmers.Level1;

//https://programmers.co.kr/learn/courses/30/lessons/12926
//연습문제 - 시저암호
public class SiserSecret {

    public String solution(String s, int n) {

        String answer = "";

        for(int i=0; i<s.length(); i++) {
            char alpa = s.charAt(i);

            if(alpa >= 'a' && alpa <= 'z') {
                if(alpa + n > 'z'){
                    answer += (char)(alpa + n-26);
                }
                else {
                    answer += (char)(alpa + n);
                }
            }
            else if(alpa >= 'A' && alpa <= 'Z') {
                if(alpa + n > 'Z'){
                    answer += (char)(alpa + n-26);
                }
                else{
                    answer += (char)(alpa + n);
                }
            }
            else answer += ' ';

        }
        return answer;
    }

    public static void main(String[] args) {
        SiserSecret siserSecret = new SiserSecret();
        System.out.println(siserSecret.solution("AaZz",25));
    }
}
