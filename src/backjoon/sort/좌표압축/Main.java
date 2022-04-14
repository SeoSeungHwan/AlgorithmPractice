package backjoon.sort.좌표압축;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int[] arr = new int[n];
        int[] copyArr = new int[n];

        StringTokenizer stringTokenizer= new StringTokenizer(bufferedReader.readLine()," ");
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(stringTokenizer.nextToken());
            arr[i] = num;
            copyArr[i] = num;
        }

        Arrays.sort(copyArr);

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int rank=0;
        for(int num : copyArr){
            if(!hashMap.containsKey(num)){
                hashMap.put(num,rank++);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<n; i++){
            stringBuilder.append(hashMap.get(arr[i])+" ");
        }
        System.out.print(stringBuilder);

        bufferedReader.close();
    }
}
