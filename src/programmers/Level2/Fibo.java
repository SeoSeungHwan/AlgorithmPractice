package programmers.Level2;

//https://programmers.co.kr/learn/courses/30/lessons/12945
//연습문제 - 피보나치 수 ( 재귀 사용 x )

class Fibo {
    public int fibo(int n) {

        int answer =0;
        int num1 = 1;
        int num2 = 1;

        if(n==1 || n ==2){
            return 1;
        }else{
            for(int i=3; i<=n ; i++){
                answer = (num1+num2)%1234567;
                num1 = num2;
                num2 = answer;
            }
            return answer;
        }
    }
}