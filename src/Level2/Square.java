package Level2;

//Summer/Winter Coding2019 - 멀쩡한 사각형
//https://programmers.co.kr/learn/courses/30/lessons/62048
public class Square {
    public long square(int w, int h) {
        long answer = (long)w * (long)h;
        long min = (long)h;
        long max = (long)w;
        if (w < h) {
            min = (long)w;
            max = (long)h;
        }

        long value = 1;
        while (value > 0) {
            value = max % min;
            max = min;
            min = value;
        }

        answer = answer - ((long)w + (long)h - max);
        return answer;
    }
}
