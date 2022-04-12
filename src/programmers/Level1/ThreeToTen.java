package programmers.Level1;

//https://programmers.co.kr/learn/courses/30/lessons/68935
//월간코드 챌린지 시즌1 -3진법 뒤집기

class ThreeToTen {
    public int threetoten(int n) {
        int answer = 0;

        //10진법을 3진법으로
        String s = "";
        while(n>0){
            s+= n%3;
            n = n/3;
        }

        //3진법을 다시 10진법으로
        for(int i=0; i< s.length(); i++){
            answer += (s.charAt(i) - '0') * Math.pow(3,s.length()-i-1);
        }
        return answer;
    }
}