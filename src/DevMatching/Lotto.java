package DevMatching;

//로또의 최고 순위와 최저 순위
//https://programmers.co.kr/learn/courses/30/lessons/77484
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int correct = 0;
        int zero =0;
        for(int i=0; i<6 ; i++){
            if(lottos[i]==0){
                zero++;
            }
            for(int j=0 ; j<6 ; j++){
                if(lottos[i]!=0 && lottos[i]==win_nums[j]){
                    correct++;
                }
            }
        }

        answer[0] = correct+zero;
        answer[1] = correct;
        if(answer[0] ==1 || answer[0] ==0){
            answer[0] =6;
        }else{
            answer[0] = 7- answer[0];
        }

        if(answer[1] ==1 || answer[1] ==0){
            answer[1] =6;
        }else{
            answer[1] = 7- answer[1];
        }

        return answer;
    }
}
