package Level1;

//https://programmers.co.kr/learn/courses/30/lessons/17682
//2018 KAKAO BLIND RECRUITMENT - 다트 게임
public class Dart {
    public int dart(String dartResult) {
        int answer = 0;

        int[] arr = new int[4];
        int index= 0;

        String s = dartResult.replaceAll("10","t");
        int num = 0;
        int before = 0;
        for(int i=0;i <s.length(); i++){
            char c = s.charAt(i);

            //숫자를 변수에 저장
            if('0'<=c && c <='9'){
                num = Character.getNumericValue(c);
            }else if(c == 't'){
                num = 10;
            }
            //제곱하기
            if(c=='S'){
                arr[index++] = (int)Math.pow(num,1);
            }else if(c =='D'){
                arr[index++] = (int)Math.pow(num,2);
            }else if(c == 'T'){
                arr[index++] = (int)Math.pow(num,3);
            }else if(c =='*'){
                if(index != 1){
                    arr[index-2] = arr[index-2]*2;
                }
                arr[index-1] = arr[index-1] *2;
            }else if(c =='#'){
                arr[index-1] = arr[index-1] * -1;
            }



        }
        for(int i=0; i<3 ; i++){
            answer += arr[i];
        }
        return answer;
    }
}
