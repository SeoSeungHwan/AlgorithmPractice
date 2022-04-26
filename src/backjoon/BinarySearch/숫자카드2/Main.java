package backjoon.BinarySearch.숫자카드2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[20000001];
        for(int i=0; i<n; i++){
            int num = scanner.nextInt();
            if(num <0){
                arr[10000000+Math.abs(num)]++;
            }else{
                arr[num]++;
            }
        }

        int m = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<m; i++){
            int num = scanner.nextInt();
            if(num <0){
                stringBuilder.append(arr[10000000+Math.abs(num)]+" ");
            }else{
                stringBuilder.append(arr[num]+" ");
            }
        }
        System.out.println(stringBuilder);
    }
}
