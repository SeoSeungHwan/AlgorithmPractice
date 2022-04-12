package programmers.Level1;

//월간 코드챌린지 시즨2 - 약수의 개수와 덧셈
//https://programmers.co.kr/learn/courses/30/lessons/77884
public class Divisor {
    public int divisor(int left, int right) {
        int answer = 0;

        for(int i=left ; i<=right ; i++){
            int count = 0;
            for(int j=1; j<=i ;j++){
                if(i% j == 0){
                    count++;
                }
            }
            if(count %2 ==0){
                answer = answer + i;
            }else{
                answer = answer - i;
            }
        }

        return answer;
    }
}
