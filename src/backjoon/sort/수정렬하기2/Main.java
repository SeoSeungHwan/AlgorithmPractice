package backjoon.sort.수정렬하기2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int n = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<n;i++ ){
            arrayList.add(scanner.nextInt());
        }

        Collections.sort(arrayList);

        for (int num:arrayList) {
            stringBuilder.append(num + "\n");
        }
        System.out.println(stringBuilder);
    }
}
