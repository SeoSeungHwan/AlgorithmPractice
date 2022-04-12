package programmers.Level1;

//연습문제 - 가운데글자 가져오기
//https://programmers.co.kr/learn/courses/30/lessons/12903

class CenterChar {
    public String centerchar(String s) {
        String answer = "";

        int num = s.length() /2-1;
        if(s.length() %2 ==0){
            return s.substring(num,num+2);
        }else{
            return s.substring(num+1,num+2);
        }

    }
}