package backjoon.BinarySearch.숫자카드1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] arr;
    public static int n,m;
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        n = scanner.nextInt();

        arr = new int[n];
        for(int i=0; i<n; i++){
            int num = scanner.nextInt();
            arr[i] = num;
        }
        Arrays.sort(arr);

        m = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<m; i++){
            int num = scanner.nextInt();
            if(binarySearch(num)){
                stringBuilder.append("1 ");
            }else{
                stringBuilder.append("0 ");
            }
        }

        System.out.println(stringBuilder);
    }

    public static boolean binarySearch(int num){
        int start =0;
        int end =n-1;

        while(start<= end){
            int midIndex = (start+end)/2;
            int mid = arr[midIndex];
            if(num <mid){
                end = midIndex-1;
            }else if(num >mid){
                start = midIndex+1;
            }else{
                return true;
            }
        }
        return false;
    }
}
