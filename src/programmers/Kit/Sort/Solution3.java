package programmers.Kit.Sort;

import java.util.*;

public class Solution3 {
    public int solution3(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for(int i=0 ; i<citations.length;i++){
            int a = citations.length -i;

            if(citations[i] >= a){
                answer = a;
                break;
            }
        }
        return answer;
    }
}
