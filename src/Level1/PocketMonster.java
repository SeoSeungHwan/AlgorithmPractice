package Level1;

//https://programmers.co.kr/learn/courses/30/lessons/1845
//찾아라 프로그래밍 마에스터 - 포켓몬

import java.util.*;

class PocketMonster {
    public int pocketmonster(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length ; i++){
            set.add(nums[i]);
        }

        System.out.println(set.size());
        if(set.size() <nums.length/2){
            return set.size();
        }else{
            return nums.length/2;
        }

    }
}