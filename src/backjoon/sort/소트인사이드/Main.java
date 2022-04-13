package backjoon.sort.소트인사이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        Integer[] arr = new Integer[s.length()];
        for(int i=0; i<s.length(); i++){
            arr[i] = s.charAt(i)-'0';
        }

        Arrays.sort(arr, Collections.reverseOrder());
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            stringBuilder.append(arr[i]);
        }

        System.out.println(stringBuilder);
        bufferedReader.close();
    }
}
