package programmers.Level1;

//https://programmers.co.kr/learn/courses/30/lessons/86051
//월간 코드 챌린지 시즌3 - 없는 숫자 더하기

public class NoNum {
    public int nonum(int[] numbers) {
        int answer = 0;

        boolean[] numarr = new boolean[10];

        for(int i =0; i<numbers.length; i++){
            numarr[numbers[i]] = true;
        }

        for(int i=0; i<numarr.length; i++){
            if(numarr[i] == false){
                answer += i;
            }
        }
        return answer;
    }
}
