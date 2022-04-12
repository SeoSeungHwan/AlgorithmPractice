package programmers.Level2;

//https://programmers.co.kr/learn/courses/30/lessons/68645
//월간 코드 챌린지 시즌1 - 삼각달팽이
class Snail {
    public int[] snail(int n) {
        //정답배열과 피라미드배열 초기화
        int[] answer = new int[(n*(n+1))/2];
        int[][] arr = new int[n][n];

        int x = -1, y = 0;
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else if (i % 3 == 2) {
                    x--;
                    y--;
                }
                arr[x][y] = num++;
            }
        }

        int k = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == 0)
                    break;
                answer[k++] = arr[i][j];
            }
        }

        return answer;
    }
}
