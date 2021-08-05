package Level1;


//https://programmers.co.kr/learn/courses/30/lessons/12906
//연습문제 - 같은숫자는 싫어

public class HateTheSameNum {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        int index =0;
        int beforeNum = -1;
        int size=0;

        //이전 숫자랑 같으면 패스 다르면 저장
        for(int i=0 ; i<arr.length; i++){
            if(arr[i] == beforeNum){
                continue;
            }else{
                answer[index++] = arr[i];
                beforeNum = arr[i];
                size++;
            }
        }

        //뒤에 0으로 초기화된거 다 삭제하기
        int[] newAnswer = new int[size];
        for(int i=0 ; i<size ; i++){
            newAnswer[i] = answer[i];
        }
        return newAnswer;
    }
}
