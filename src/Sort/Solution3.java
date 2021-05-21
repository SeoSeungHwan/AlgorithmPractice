package Sort;

import java.util.*;

public class Solution3 {
    public int solution3(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);
        int size = citations.length;

        if(size - size/2 < citations[size/2]){
            return size - size/2;
        }else{
            return citations[size/2];
        }
    }

    public static void main(String[] args) {
        int[] arr = {20,19,18,1};
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.solution3(arr));
    }
}
