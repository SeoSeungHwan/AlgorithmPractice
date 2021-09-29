package Level2;

//https://programmers.co.kr/learn/courses/30/lessons/12939
//연습문제 - 최댓값과 최솟값

class MaxMinInString {
    public String maxmininstring(String s) {
        String answer = "";

        String[] arr = s.split(" ");

        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        for(int i=0; i< arr.length; i++){
            int num = Integer.parseInt(arr[i]);
            if(min  > num){
                min = num;
            }
            if(max < num){
                max = num;
            }
        }
        return min + " "+max;
    }
}