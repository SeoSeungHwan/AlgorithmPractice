package backjoon.numbertheory.패션왕신해빈;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();



        for(int i=0; i<n ; i++){

            HashMap<String,Integer> hashMap = new HashMap<>();

            int m = scanner.nextInt();

            for(int k=0; k<m; k++){
                scanner.next();
                String kind = scanner.next();
                if(hashMap.containsKey(kind)){
                    hashMap.put(kind,hashMap.get(kind)+1);
                }else{
                    hashMap.put(kind,1);
                }
            }

            int result =1;

            for(int value : hashMap.values()){
                result = result * (value+1);
            }

            System.out.println(result-1);
        }
    }
}
