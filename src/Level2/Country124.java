package Level2;

//프로그래머스 연습문제  - 124나라의 숫자
//https://programmers.co.kr/learn/courses/30/lessons/12899

public class Country124 {
    public String country124(int n) {
        String answer = "";

        String[] arr = {"4","1","2"};
        int num = n;

        while(num !=0){
            int remain = num % 3;
            num = num /3;

            if(remain == 0){
                num--;
            }

            answer = arr[remain] + answer;

        }

        return answer;
    }
}
