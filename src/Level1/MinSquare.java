package Level1;

//https://programmers.co.kr/learn/courses/30/lessons/86491
//위클리 챌린지 8주차 - 최소직사각형

class MinSquare {
    public int minsquare(int[][] sizes) {

        for(int i=0; i< sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        int max1 = sizes[0][0];
        int max2 = sizes[0][1];
        for(int i=0; i< sizes.length; i++){
            if(sizes[i][0] > max1){
                max1 = sizes[i][0];
            }
            if(sizes[i][1] > max2){
                max2 = sizes[i][1];
            }
        }

        return max1 * max2;
    }
}