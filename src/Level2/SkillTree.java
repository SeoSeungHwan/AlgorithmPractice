package Level2;

//https://programmers.co.kr/learn/courses/30/lessons/49993
//Summer/Winter Coding(~2018) - 스킬트리

import java.util.*;

class SkillTree {
    public int skilltree(String skill, String[] skill_trees) {
        int answer = 0;

        Queue<Character> queue = new LinkedList<>();

        for(int i=0; i < skill_trees.length ; i++){
            //스킬을 queue에 삽입
            for(int z=0; z< skill.length(); z++){
                queue.add(skill.charAt(z));
            }

            boolean flag = true;

            //스킬 트리만큼 반복
            for(int j=0; j< skill_trees[i].length(); j++){
                if(queue.isEmpty() == false && skill_trees[i].charAt(j) == queue.peek()){
                    System.out.println(i+":" + skill_trees[i].charAt(j) + ","+queue.peek());
                    queue.remove();
                }
            }
            //skill트리에 아직 남아있는 스킬이 존재한다면 불가능한 스킬트리임을 나타냄
            for(int k =0; k<skill_trees[i].length(); k++){
                for(char c : queue){
                    if(c == skill_trees[i].charAt(k)){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                answer ++;
            }

            //다음 스킬트리 검사를 위해 다시 초기화
            queue.clear();
        }
        return answer;
    }
}