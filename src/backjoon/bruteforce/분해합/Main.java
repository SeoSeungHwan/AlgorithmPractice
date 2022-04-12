package backjoon.bruteforce.분해합;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for(int i =1; i<=n; i++){

            if(i == n){
                System.out.println(0);
                break;
            }
            int iSum= 0;
            String iStr= Integer.toString(i);
            for(int j=0; j<iStr.length(); j++){
                iSum += Character.getNumericValue(iStr.charAt(j));
            }

            if(iSum + i == n){
                System.out.println(i);
                break;
            }
        }
    }
}
