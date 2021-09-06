package Level1;

//https://programmers.co.kr/learn/courses/30/lessons/12921
//연습문제 - 소수 찾기
//에라토스테네스의 채 사용
public class FindSosu {
    public int findsosu(int n) {
        int answer = 0;
        int[] numbers = new int[n+1];

        for(int i=2; i<=n; i++) numbers[i]=i;

        for(int i=2; i<n; i++) {

            if(numbers[i] == 0) continue;

            for(int j=2*i; j<=n; j+=i) numbers[j] = 0;
        }

        for(int i=0; i<numbers.length; i++) {

            if(numbers[i] != 0) answer++;
        }

        return answer;
    }
}
