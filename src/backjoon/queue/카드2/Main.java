package backjoon.queue.카드2;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        Queue<String> queue =new LinkedList<>();
        for(int i=1; i<=Integer.parseInt(n);i++){
            queue.add(Integer.toString(i));
        }
        boolean check = true;

        while(queue.size()!=1){
            if(check){
                queue.remove();
                check=false;
            }else{
                queue.add(queue.remove());
                check=true;
            }
        }
        System.out.println(queue.remove());
    }
}
