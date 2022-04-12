package programmers.Level2;

//https://programmers.co.kr/learn/courses/30/lessons/12953
//연습문제 - n개의 최소공배수

class NLCM {
    public int nlcm(int[] arr) {
        int answer = 1;

        while(true){

            boolean check = true;
            for(int i=0 ; i<arr.length; i++){
                if(answer%arr[i] !=0){
                    check = false;
                    break;
                }
            }
            if(check){
                return answer;
            }
            answer++;
        }
    }
}