package programmers.Level2;

//https://programmers.co.kr/learn/courses/30/lessons/12941
//연습문제 - 최솟값 만들기


import java.util.*;
class MakeMin
{
    public int makemin(int []A, int []B)
    {
        int answer = 0;


        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0; i<A.length ; i++){
            answer+= A[i] * B[B.length-1-i];
        }

        return answer;
    }
}