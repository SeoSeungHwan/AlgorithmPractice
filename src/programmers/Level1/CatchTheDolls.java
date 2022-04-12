package programmers.Level1;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/64061

public class CatchTheDolls {
    public int catchthedolls(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        //이동횟수만큼 반복
        for(int i=0 ; i<moves.length;i++){

            for(int j=0; j <board.length;j++){
                if(board[j][moves[i]-1] !=0 ){

                    if(!stack.empty()){
                        if(stack.peek() == board[j][moves[i]-1]){
                            stack.pop();
                            answer= answer +2;
                            board[j][moves[i]-1] =0;
                            break;
                        }else{
                            stack.push(board[j][moves[i]-1]);
                            board[j][moves[i]-1] =0;
                            break;
                        }
                    }else{
                        stack.push(board[j][moves[i]-1]);
                        board[j][moves[i]-1] =0;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
