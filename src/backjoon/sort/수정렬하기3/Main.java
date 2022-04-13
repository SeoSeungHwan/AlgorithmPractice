package backjoon.sort.수정렬하기3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[10001];

        for(int i=0; i<n;i++ ){
            arr[Integer.parseInt(bufferedReader.readLine())]++;
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i<10001; i++){
            for(int j=0; j<arr[i]; j++){
                stringBuilder.append(i+"\n");
            }
        }
        System.out.println(stringBuilder);
        bufferedReader.close();
    }
}
