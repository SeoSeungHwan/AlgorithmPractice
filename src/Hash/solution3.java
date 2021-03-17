package Hash;

import java.util.HashMap;

class solution3 {
    public int solution3(String[][] clothes) {

        int answer = 1;

        HashMap<String,Integer> hashMap = new HashMap<>();
        for(int i=0 ; i<clothes.length; i++){
            if(hashMap.containsKey(clothes[i][1])){
                hashMap.replace(clothes[i][1],hashMap.get(clothes[i][1])+1);
            }else{
                hashMap.put(clothes[i][1],1);
            }
        }

        for(int value : hashMap.values()){
            answer = answer * (value+1);
        }


        return answer -1;
    }
}
