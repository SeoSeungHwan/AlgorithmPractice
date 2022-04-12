package backjoon.bruteforce.블랙잭;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] cards = new int[n];
        for(int i=0; i<cards.length; i++){
            cards[i] = scanner.nextInt();
        }
        Arrays.sort(cards);
        System.out.println(search(cards,n,m));

    }
    static public int search(int[] cards, int n, int m){
        int answer =0;
        for(int i=0; i<n-2; i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1; k<n;k++){
                    int sum = cards[i]+cards[j]+cards[k];
                    if(sum == m){
                        return sum;
                    }
                    if(answer < sum && sum < m){
                        answer = sum;
                    }
                }
            }
        }
        return answer;
    }
}

