package Sort;

import java.util.Arrays;

public class solution1 {
    public int[] solution1(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];




        for(int i=0 ; i<commands.length; i++){
            int array_index =0;
            int[] a = new int[commands[i][1]-commands[i][0]+1];
            for(int j = commands[i][0]-1 ; j < commands[i][1]; j++){
                a[array_index++] = array[j];
            }
            Arrays.sort(a);
            answer[i] = a[commands[i][2]-1];

        }
        return answer;
    }
}
