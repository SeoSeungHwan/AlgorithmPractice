package backjoon.string.그룹단어체커;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();

        int answer =0;
        ArrayList<Character> arrayList = new ArrayList<>();
        for(int i=0; i<n; i++){
            String str = scanner.next();
            char before = str.charAt(0);
            arrayList.add(before);
            boolean check = true;
            for(int j=1; j<str.length(); j++){
                char c = str.charAt(j);
                if(before != c && arrayList.contains(c)){
                    check = false;
                    break;
                }else{
                    before = c;
                    arrayList.add(c);
                }
            }
            if(check){
                answer++;
            }
            arrayList.clear();
        }
        System.out.println(answer);
    }
}
