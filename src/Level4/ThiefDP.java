package Level4;

//https://programmers.co.kr/learn/courses/30/lessons/42897
//DP - 도둑질

class ThiefDP {
    public int thiefDP(int[] money) {

        int[] dpFirst = new int[money.length-1];
        int[] dpNotFirst = new int[money.length];

        dpFirst[0] = money[0];
        dpFirst[1] = money[0];
        dpNotFirst[0] = 0;
        dpNotFirst[1] = money[1];

        for(int i=2 ; i<dpFirst.length; i++){
            dpFirst[i] = Math.max(dpFirst[i-2]+money[i] , dpFirst[i-1]);
        }
        for(int i=2 ; i<dpNotFirst.length; i++){
            dpNotFirst[i] = Math.max(dpNotFirst[i-2]+money[i] , dpNotFirst[i-1]);
        }

        return Math.max(dpFirst[dpFirst.length-1] , dpNotFirst[dpNotFirst.length-1]);
    }
}
