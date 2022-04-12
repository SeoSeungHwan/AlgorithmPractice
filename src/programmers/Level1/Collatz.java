package programmers.Level1;

//https://programmers.co.kr/learn/courses/30/lessons/12943
//연습문제 - 콜라츠 추측
public class Collatz {
    public int collatz(int num) {

        int answer = 0;
        long n = num;
        for(int i=0 ; i<500 ; i++){

            if(n ==1){
                return i;
            }

            if(n%2==0){
                n = n/2;
            }else{
                n = n*3 +1;
            }

            if(i ==499){
                return -1;
            }
        }
        return answer;
    }
}
