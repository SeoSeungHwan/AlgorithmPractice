package StackQueue;

//https://programmers.co.kr/learn/courses/30/lessons/42584
//주식 가격
public class Solution2 {
    public int[] solution2(int[] prices) {
        int[] answer = new int[prices.length];

        int min=0;
        int index =0;
        int answer_index =0;
        for(int i=0; i<prices.length-1; i++){
            index =0;
            min = prices[i];
            for(int j =i+1 ; j< prices.length;j++){
                index++;
                if(min > prices[j]|| j==prices.length-1){
                    answer[answer_index++] = index;
                    break;
                }

            }
        }
        answer[answer_index] = 0;
        return answer;
    }

}
