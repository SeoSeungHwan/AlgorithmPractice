package Level1;

//https://programmers.co.kr/learn/courses/30/lessons/12912
//연습문제 - 두정수사이의 합
public class BetweemSum {
    public long betweemsum(int a, int b) {
        long answer = 0;

        if(a<b){
            for(int i= a; i<=b ; i++){
                answer = answer + i;
            }
        }else{
            for(int i=b; i<=a; i++){
                answer = answer+i;
            }
        }

        return answer;
    }
}
