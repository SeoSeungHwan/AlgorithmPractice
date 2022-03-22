package Level2;

//https://programmers.co.kr/learn/courses/30/lessons/42883
//Greedy - 큰수만들기

class MakeBigNumber {
    public String makeBigNumber(String number, int k) {
        StringBuilder answer = new StringBuilder();

        int index =0;
        for(int i=0; i<number.length()-k; i++){
            int compare =0;
            for(int j=index; j<=i+k; j++){
                if(compare < number.charAt(j)-'0'){
                    compare = number.charAt(j)-'0';
                    index = j+1;
                }
            }
            answer.append(compare);
        }
        return answer.toString();
    }
}