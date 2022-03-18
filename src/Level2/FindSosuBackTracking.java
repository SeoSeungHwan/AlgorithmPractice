package Level2;

//https://programmers.co.kr/learn/courses/30/parts/12230
//연습문제 - 완전탐색 - 소수찾기 (백트래킹 이용)

import java.util.*;

class FindSosuBackTracking {

    HashSet<Integer> hashSet;
    boolean[] visited;

    public int findSosuBackTracking(String numbers) {

        int answer = 0;
        hashSet = new HashSet<>();
        visited = new boolean[numbers.length()];

        backTracking(0,numbers,"");

        return hashSet.size();
    }

    public void backTracking(int depth, String numbers, String currentNumbers){
        if(depth == numbers.length()){
            return;
        }
        for(int i=0; i< numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                String str = currentNumbers + numbers.charAt(i);
                if(checkSosu(str)){
                    hashSet.add(Integer.parseInt(str));
                }

                backTracking(depth+1,numbers,str);
                visited[i] = false;
            }
        }
    }

    public boolean checkSosu(String number){
        int n = Integer.parseInt(number);
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        if (n <= 1) {
            return false;
        }
        System.out.println(number);
        return true;
    }
}