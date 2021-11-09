package Level2;


//2021 Dev-matching - 행렬 테두리 회전하기
//https://programmers.co.kr/learn/courses/30/lessons/77485

class MatrixRotate {

    static int[][] arr;
    static int min;

    public int[] matrixrotate(int rows, int columns, int[][] queries) {
        arr = new int[rows + 1][columns + 1];
        int[] answer = new int[queries.length];
        int num = 1;
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= columns; j++) {
                arr[i][j] = num;
                num++;
            }
        }

        for(int i = 0; i < queries.length; i++) {
            answer[i] = rotation(queries[i]);
        }
        return answer;
    }

    static int rotation(int[] query) {
        // 직사각형의 가로 세로 길이
        int xMove = query[2] - query[0];
        int yMove = query[3] - query[1];

        // 현재 위치 및 현재 값
        int nx = query[0];
        int ny = query[1];
        int now = arr[nx][ny];

        // 현재값을 최소값으로 초기화
        min = now;

        // 오른쪽
        for(int i = 0; i < yMove; i++) {
            ny += 1;
            now = move(nx, ny, now);
        }

        // 아래
        for(int i = 0; i < xMove; i++) {
            nx += 1;
            now = move(nx, ny, now);
        }

        // 왼쪽
        for(int i = 0; i < yMove; i++) {
            ny -= 1;
            now = move(nx, ny, now);
        }

        // 위쪽
        for(int i = 0; i < xMove; i++) {
            nx -= 1;
            now = move(nx, ny, now);
        }
        return min;
    }

    static int move(int x, int y, int before) {
        // 임시저장을 위한 변수 temp
        int temp = arr[x][y];

        // 최소값 구하기
        min = Math.min(min, temp);

        // 이전의 값으로 초기화
        arr[x][y] = before;

        return temp;
    }
}
