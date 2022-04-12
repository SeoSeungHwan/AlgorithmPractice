package programmers.Level1;

//https://programmers.co.kr/learn/courses/30/lessons/12948
//연습문제 - 핸드폰 번호 가리기
public class HidePhoneNumber {
    public String hidephonenumber(String phone_number) {
        String answer = "";

        char[] arr = phone_number.toCharArray();
        for(int i = arr.length-5;i>=0; i--){
            arr[i] = '*';
        }

        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}
