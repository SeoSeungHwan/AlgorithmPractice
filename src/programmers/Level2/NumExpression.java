package programmers.Level2;

//연습문제 - 숫자의 표현
//https://programmers.co.kr/learn/courses/30/lessons/12924

class NumExpression {
    public int numexpression(int n) {
        int answer = 0;

        for(int i=1; i<= n; i++){
            int sum =0;
            for(int j =i ; j<=n ; j++){
                sum += j;
                if(sum == n){
                    answer++;
                    break;
                }else if(sum >=n){
                    break;
                }
            }
        }
        return answer;
    }
}
