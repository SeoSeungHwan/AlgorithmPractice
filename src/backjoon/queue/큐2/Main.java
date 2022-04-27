package backjoon.queue.큐2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();

        int last = -1;
        for(int i=0; i<n; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
            String str = stringTokenizer.nextToken();
            if(str.equals("push")){
                int num = Integer.parseInt(stringTokenizer.nextToken());
                queue.add(num);
                last = num;
            }else if(str.equals("pop")){
                if(queue.isEmpty()){
                    stringBuilder.append(-1+"\n");
                }else{
                    stringBuilder.append(queue.remove()+"\n");
                }

            }else if(str.equals("size")){
                stringBuilder.append(queue.size()+"\n");
            }else if(str.equals("empty")){
                if(queue.isEmpty()){
                    stringBuilder.append(1+"\n");
                }else{
                    stringBuilder.append(0+"\n");
                }
            }else if(str.equals("front")){
                if(queue.isEmpty()){
                    stringBuilder.append(-1+"\n");
                }else{
                    stringBuilder.append(queue.peek()+"\n");
                }

            }else if(str.equals("back")){
                if(queue.isEmpty()){
                    stringBuilder.append(-1+"\n");
                }else{
                    stringBuilder.append(last+"\n");
                }

            }
        }
        System.out.println(stringBuilder);
    }
}
