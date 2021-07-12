package Level1;


//월간 코드 챌린지 시즌1 - 내적
// https://programmers.co.kr/learn/courses/30/lessons/70128

public class Nejuck {
    public int nejuck(int[] a, int[] b) {
        int answer = 0;
        for(int i=0 ; i< a.length ; i++){
            answer = answer + (a[i]*b[i]);
        }

        return answer;
    }
}
