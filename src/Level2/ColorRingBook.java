package Level2;

//https://programmers.co.kr/learn/courses/30/lessons/1829
//2017 카카오코드 예선 - 카카오 프렌즈 컬러링북

class ColorRingBook {

    static int numberOfArea;
    static int maxSizeOfOneArea;

    //영역이 몇칸으로 이루어져있는지 저장하는 변수
    static int count = 0;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void dfs(int x, int y, int[][] picture ,boolean[][] check){
        //이미 방문한 곳이라면 리턴
        if(check[x][y]){
            return;
        }

        //원소 방문을 체크함
        check[x][y] = true;

        //영역의 크기를 1증가시킨다
        count++;

        //선택영역에서 상하좌우 4칸 확인
        for(int i=0; i<4 ; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            //벽에 닿았을 경우
            if(nx <0 || nx >= picture.length || ny <0 || ny>=picture[0].length){
                continue;
            }
            //만약 체크가안되어있고 이어져있는 곳의 색이 같다면 다시 dfs호출
            if(picture[x][y]  == picture[nx][ny] && !check[nx][ny]){
                dfs(nx,ny,picture,check);
            }
        }
    }

    public int[] colorringbook(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;


        boolean[][] check = new boolean[m][n];
        for(int i=0; i<m ;i++){
            for(int j=0; j<n ; j++){
                //비어있지않고 방문한적이 없다면
                if(picture[i][j] != 0 && !check[i][j]){
                    //구역의 개수 하나 증가
                    numberOfArea++;
                    dfs(i,j,picture,check);
                }
                //영역의 최대크기를 저장
                if(count > maxSizeOfOneArea ){
                    maxSizeOfOneArea = count;
                }
                //새로운 영역을 위해 0으로 초기화
                count = 0;
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
}
