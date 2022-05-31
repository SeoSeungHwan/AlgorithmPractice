package programmers.Level2;

//https://programmers.co.kr/learn/courses/30/lessons/12900
//연습문제 - 2 x n 타일링

class TwoNSquare {
    public int twoNSquare(int n) {
        int answer = 0;

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;

        for(int i=2; i<n; i++){
            int num = arr[i-1] + arr[i-2];
            arr[i] = num % 1000000007;
        }
        return arr[n-1];
    }
}