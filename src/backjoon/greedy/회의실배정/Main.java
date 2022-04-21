package backjoon.greedy.회의실배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int[][] arr = new int[n][2];
        for(int i=0; i<n;i++){
            String str = bufferedReader.readLine();
            StringTokenizer stringTokenizer = new StringTokenizer(str," ");
            arr[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            arr[i][1] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){
                    return o1[0]-o2[0];
                }else{
                    return o1[1]-o2[1];
                }

            }
        });

        int answer =0;
        int end_time =0;
        for(int i=0; i<n; i++){
            if(end_time<=arr[i][0]){
                end_time = arr[i][1];
                answer++;
            }
        }
        System.out.println(answer);
    }
}
