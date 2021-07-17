package Level1;

//월간 코드 챌린지 2 - 음양 더하기
//https://programmers.co.kr/learn/courses/30/lessons/76501
public class PlusMinus {
    public int plusminus(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0 ; i<absolutes.length;i++){
            if(signs[i] == true){
                answer = answer + absolutes[i];
            }else{
                answer = answer - absolutes[i];
            }
        }
        return answer;
    }
}
