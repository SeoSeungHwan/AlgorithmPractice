package programmers.Level1;

//연습문제 - 최대공약수와 최소공배수
//https://programmers.co.kr/learn/courses/30/lessons/12940

public class GCD {
    class Solution {
        public int[] solution(int n, int m) {
            int[] answer = new int[2];

            if(n <=m){
                answer[0] = gcd(m,n);
            }else{
                answer[0] = gcd(n,m);
            }
            answer[1] = (m*n) / answer[0];
            return answer;
        }

        public int gcd(int n, int m){
            if(n%m ==0){
                return m;
            }
            return gcd(m,n%m);
        }
    }
}
