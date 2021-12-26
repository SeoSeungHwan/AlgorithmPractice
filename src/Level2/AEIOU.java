package Level2;

//https://programmers.co.kr/learn/courses/30/lessons/84512?language=java
//위클리 챌린지 - 모음사전

class AEIOU {
    public int aeiou(String word) {
        String s = "AEIOU";
        int[] arr = {781,156,31,6,1};
        int answer = word.length();

        for(int i=0; i<word.length(); i++){
            int index = s.indexOf(word.charAt(i));
            answer += arr[i] * index;
        }

        return answer;
    }
}