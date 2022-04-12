package programmers.Level1;

//https://programmers.co.kr/learn/courses/30/lessons/42840
//완전탐색 - 모의고사

import java.util.*;

class Test {
    public int[] test(int[] answers) {
        ArrayList<Integer> arraylist = new ArrayList<>();


        int[] counter = new int[answers.length];

        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};

        int indexa =0;
        int indexb =0;
        int indexc =0;

        for(int i=0; i< answers.length; i++){
            indexa = i % 5;
            indexb = i % 8;
            indexc = i % 10;

            if(answers[i] == a[indexa]){
                counter[0]++;
            }
            if(answers[i] == b[indexb]){
                counter[1]++;
            }
            if(answers[i] == c[indexc]){
                counter[2]++;
            }
        }

        int max =0;
        for(int j =0; j<answers.length ; j++){
            if(counter[j] >max){
                max = counter[j];
            }
        }

        int answer_index =0;
        for(int k =0; k<answers.length ; k++){
            if(counter[k] == max){
                arraylist.add(k+1);
            }
        }

        int[] answer = new int[arraylist.size()];
        int size =0;
        for(int temp : arraylist){
            answer[size++] = temp;
        }



        return answer;
    }
}