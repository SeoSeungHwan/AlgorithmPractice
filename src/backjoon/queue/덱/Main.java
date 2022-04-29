package backjoon.queue.덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            String str = stringTokenizer.nextToken();
            if (str.equals("push_front")) {
                int num = Integer.parseInt(stringTokenizer.nextToken());
                deque.addFirst(num);
            } else if (str.equals("push_back")) {
                int num = Integer.parseInt(stringTokenizer.nextToken());
                deque.addLast(num);
            } else if (str.equals("pop_front")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(-1 + "\n");
                } else {
                    stringBuilder.append(deque.pollFirst() + "\n");
                }
            } else if (str.equals("pop_back")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(-1 + "\n");
                } else {
                    stringBuilder.append(deque.pollLast() + "\n");
                }
            }else if (str.equals("size")) {
                stringBuilder.append(deque.size() + "\n");
            } else if (str.equals("empty")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(1 + "\n");
                } else {
                    stringBuilder.append(0 + "\n");
                }
            } else if (str.equals("front")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(-1 + "\n");
                } else {
                    stringBuilder.append(deque.peekFirst() + "\n");
                }

            } else if (str.equals("back")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(-1 + "\n");
                } else {
                    stringBuilder.append(deque.peekLast() + "\n");
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
