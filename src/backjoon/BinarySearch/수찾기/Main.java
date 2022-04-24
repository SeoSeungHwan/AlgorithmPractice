package backjoon.BinarySearch.수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] nArr;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bufferedReader.readLine());
        nArr = new int[n];
        StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine()," ");
        for(int i=0; i<n; i++){
            nArr[i] = Integer.parseInt(stringTokenizer1.nextToken());
        }

        int m = Integer.parseInt(bufferedReader.readLine());
        int[] mArr = new int[m];
        StringTokenizer stringTokenizer2 = new StringTokenizer(bufferedReader.readLine()," ");
        for(int i=0; i<m; i++){
            mArr[i] = Integer.parseInt(stringTokenizer2.nextToken());
        }

        Arrays.sort(nArr);
        for(int i=0; i<m ; i++){
            System.out.println(binarySearch(mArr[i],0,n/2,n-1));
        }

    }
    public static int binarySearch(int num,int start,int mid,  int end){
        if(start >end){
            return 0;
        }
        if(num == nArr[start] || num == nArr[end] || num == nArr[mid]){
            return 1;
        }else{
            if(num<=nArr[mid]){
                return binarySearch(num,start+1,(start+mid)/2,mid-1);
            }else{
                return binarySearch(num,mid+1,(mid+end)/2,end-1);
            }
        }
    }
}
