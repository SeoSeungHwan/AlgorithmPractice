package programmers.Level2;

//https://programmers.co.kr/learn/courses/30/lessons/42842
//연습문제 -완전탐색 - 카펫

class Carpet {
    public int[] carpet(int brown, int yellow) {
        int[] answer = new int[2];

        for(int i=yellow ; i>=1; i--){
            if(yellow%i == 0){
                int column = (yellow/i) +2;
                int row = i+2;

                if((column >= row)&& ((column*row)== brown+yellow)){
                    answer[0] = column;
                    answer[1] = row;

                }
            }
        }
        return answer;
    }
}