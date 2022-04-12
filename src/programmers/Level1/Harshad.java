package programmers.Level1;

//https://programmers.co.kr/learn/courses/30/lessons/12947
//연습문제 - 하샤드 수
public class Harshad {
    public boolean harshad(int x) {

        int sum = 0;
        int num = x;
        while(num != 0){
            sum += num % 10;
            num = num /10;
        }

        if(x % sum == 0){
            return true;
        }else{
            return false;
        }

    }
}
