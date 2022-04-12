package programmers.Level2;

//2017 팁스타운 - 예상 대진표
//https://programmers.co.kr/learn/courses/30/lessons/12985

class Tournament
{
    public int tournament(int n, int a, int b)
    {
        int answer = 1;
        int left =0;
        int right =0;

        if(a<b){
            left = a;
            right = b;
        }else{
            left = b;
            right = a;
        }

        while(true){
            if(left %2 !=0 && right - left ==1){
                break;
            }
            left= (left +1) /2;
            right = (right+1)/2;
            answer++;
        }
        return answer;
    }
}