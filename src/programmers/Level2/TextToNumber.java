package programmers.Level2;

//https://programmers.co.kr/learn/courses/30/lessons/81301
//2021 카카오 채용연계형 인턴십 - 숫자 문자열과 영단어
public class TextToNumber {
    public int texttonumber(String s) {
        int answer = 0;

        String[][] str = {{"0","zero"},
                {"1","one"},
                {"2","two"},
                {"3","three"},
                {"4","four"},
                {"5","five"},
                {"6","six"},
                {"7","seven"},
                {"8","eight"},
                {"9","nine"}
        };

        for(int i=0 ; i<10; i++){
            s = s.replaceAll(str[i][1],str[i][0]);
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}
