package Level3;

//https://programmers.co.kr/learn/courses/30/lessons/12952
//연습문제 - N-Queen(백 트래킹 사용)

class NQueen {

    boolean[] visited;
    int[] board;
    int answer = 0;
    public int nQueen(int n) {
        visited = new boolean[n];
        board = new int[n];

        backTracking(0);
        return answer;
    }

    public void backTracking(int depth){
        //퀸의 개수가 n개이면 리턴 , 방법의 수 +1
        if(depth == board.length){
            answer++;
            return;
        }

        for(int i=0; i<board.length; i++){
            if(!visited[i]){
                visited[i] = true;

                board[depth] = i;

                if(checkQueen(depth)){
                    backTracking(depth+1);
                }
                visited[i] = false;
            }
        }
    }

    public boolean checkQueen(int depth){

        for(int i=0; i<depth; i++){
            //같은 행에 있다면 false
            if(board[depth] == board[i]){
                return false;
            }

            //대각선에 있다면 false
            if(Math.abs(i-depth) == Math.abs(board[depth] - board[i])){
                return false;
            }
        }
        return true;
    }
}