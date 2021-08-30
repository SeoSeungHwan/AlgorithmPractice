package Level1;

//https://programmers.co.kr/learn/courses/30/lessons/12921
//연습문제 - 소수 찾기
public class FindSosu {
    public int findsosu(int n) {
        int answer = 0;

        for(int i=2;i<=n;i++){
            boolean check = true;
            for(int j=2 ; j<i ; j++){
                if(i%j == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                answer++;
            }

        }
        return answer;
    }
}
