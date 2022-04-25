package backjoon.string.상수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        String n = scanner.next();
        String m = scanner.next();

        String nStr="";
        String mStr="";
        for(int i=0; i<n.length(); i++){
            nStr += n.charAt(n.length()-1-i);
        }
        for(int i=0; i<m.length(); i++){
            mStr += m.charAt(m.length()-1-i);
        }
        int nInt = Integer.parseInt(nStr);
        int mInt = Integer.parseInt(mStr);
        if(nInt >=mInt){
            System.out.println(nStr);
        }else{
            System.out.println(mStr);
        }
    }
}
