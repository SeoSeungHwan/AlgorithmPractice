package programmers.Level1;

//연습문제 - 숫자찾기
public class StringFindNum {
    public boolean solution(String s) {
        boolean answer = true;

        char[] arr = s.toCharArray();
        for(int i=0 ; i<arr.length; i++){
            if('0'<=arr[i] && arr[i]<='9'){
                continue;
            }else{
                return false;
            }
        }
        return answer;
    }
}
