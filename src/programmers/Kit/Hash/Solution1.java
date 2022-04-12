package programmers.Kit.Hash;

import java.util.Arrays;

class Solution1 {
    public String solution1(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for(i=0 ; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }

        return participant[i];
    }
}