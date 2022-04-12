package programmers.Level3;

//DP - 정수 삼각형
//https://programmers.co.kr/learn/courses/30/lessons/43105

class IntTriangle {

    public int intTriangle(int[][] triangle) {

        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];

        for(int i=1; i<triangle.length; i++){
            dp[i][0] = dp[i-1][0] + triangle[i][0];

            for(int j=1; j<triangle[i].length;j++){
                dp[i][j] = triangle[i][j] + Math.max(dp[i-1][j] , dp[i-1][j-1]);
            }
        }

        int max = 0;
        for(int i=0; i< dp[triangle.length-1].length;i++){
            max = Math.max(dp[triangle.length-1][i] , max);
        }

        return max;
    }
}


/*
//시간 초과
class IntTriangle {

    int max = 0;

    public int intTriangle(int[][] triangle) {

        sumNext(triangle[0][0],0,0,triangle);

        return max;
    }

    public void sumNext(int sum, int depth , int index, int[][] triangle){
        if( depth==triangle.length-1){
            max = Math.max(max,sum);
        }else{
            sumNext(sum+triangle[depth+1][index],depth+1,index,triangle);
            sumNext(sum+triangle[depth+1][index+1],depth+1,index+1,triangle);
        }
    }
}
*/


