package backjoon.sort.통계학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(bufferedReader.readLine());
            arr[i] = num;
        }

        Arrays.sort(arr);

        // 산술평균
        double sum =0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        System.out.println((int)Math.ceil(Math.round(sum/n)));



        // 중앙값
        System.out.println(arr[n/2]);


        //최빈값
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] count = new int[8001];
        int max = Integer.MIN_VALUE;
        for(int i=0; i< n; i++){
            if(arr[i] < 0){
                count[Math.abs(arr[i])+4000]++;
            }else{
                count[arr[i]]++;
            }
        }
        for(int i=0; i<8001;i++){
            if(count[i] > max){
                max = count[i];
            }
        }

        for(int i=0; i<8001;i++){
            int num=i;
            if(count[i] ==max){
                if(i>4000){
                    num = (num-4000) * -1;
                    arrayList.add(num);
                }else{
                    arrayList.add(i);
                }
            }
        }
        Collections.sort(arrayList);
        if(arrayList.size()>1){
            System.out.println(arrayList.get(1));
        }else{
            System.out.println(arrayList.get(0));
        }

        //범위
        System.out.println(arr[n-1]-arr[0]);
        bufferedReader.close();
    }
}
