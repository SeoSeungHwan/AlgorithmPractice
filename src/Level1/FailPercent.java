package Level1;

//https://programmers.co.kr/learn/courses/30/lessons/42889#
//2019 KAKAO BLIND RECRUITMENT - 실패율

import java.util.*;

class FailPercent {
    public int[] failpercent(int N, int[] stages) {


        Map<Integer,Double> map = new LinkedHashMap<Integer,Double>();

        //스테이지 실패율을 hashMap에 저장
        for(int i=1; i<=N ; i++){
            int count =0;
            int people = 0;
            for(int j=0; j<stages.length; j++){
                if(stages[j] == i){
                    count++;
                }
                if(stages[j] >= i){
                    people++;
                }
            }
            if(people == 0){
                map.put(i,0.0);
            }else{
                map.put(i,(double)count/(double)people);
            }

        }

        Map<Integer,Double> result = sortMapByValue(map);

        int[] answer = new int[result.size()];
        int index = 0;
        for (Map.Entry<Integer, Double> entry : result.entrySet()) {
            answer[index++] = entry.getKey();
        }

        return answer;
    }
    public static LinkedHashMap<Integer, Double> sortMapByValue(Map<Integer, Double> map) {
        List<Map.Entry<Integer, Double>> entries = new LinkedList<>(map.entrySet());

        Collections.sort(entries, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        LinkedHashMap<Integer, Double> result = new LinkedHashMap<>();
        for (Map.Entry<Integer, Double> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}