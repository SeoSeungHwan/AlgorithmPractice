package programmers.Level1;

import java.util.ArrayList;

//로또의 최고 순위와 최저 순위(다른 방법)
//https://programmers.co.kr/learn/courses/30/lessons/77484
class Lotto {
    public int[] lotto(int[] lottos, int[] win_nums) {
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

//다른 방법
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        ArrayList<Integer> lottosArrayList = new ArrayList<>();
        ArrayList<Integer> winArrayList = new ArrayList<>();
        for(int i=0; i<win_nums.length; i++){
            winArrayList.add(win_nums[i]);
        }

        int zero = 0;
        for(int i=0; i<lottos.length; i++){
            winArrayList.remove(Integer.valueOf(lottos[i]));
            if(lottos[i] == 0){
                zero++;
            }
        }

        System.out.println(winArrayList.size());


        int min = 6- winArrayList.size();
        int max = min + zero;

        int[] answer = new int[2];
        answer[0] = rank(max);
        answer[1] = rank(min);
        return answer;

    }

    public int rank(int num){
        if(num ==6){
            return 1;
        }
        else if(num ==5){
            return 2;
        }
        else if(num ==4){
            return 3;
        }
        else if(num ==3){
            return 4;
        }
        else if(num ==2){
            return 5;
        }
        else{
            return 6;
        }
    }
}

