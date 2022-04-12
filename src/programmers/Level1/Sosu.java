package programmers.Level1;

//Summer/Winter Coding(~2018) -소수만들기
//https://programmers.co.kr/learn/courses/30/lessons/12977

class Sosu {
    public int sosu(int[] nums) {
        int answer = 0;

        int sum =0;
        for(int i=0 ; i<nums.length-2;i++){
            for(int j=i+1 ; j<nums.length-1; j++){
                for(int k = j+1 ; k<nums.length;k++){
                    sum = nums[i] + nums[j] + nums[k];
                    if(sosu(sum) == true){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public boolean sosu(int num){
        int i=2;
        while(i<num){
            if(num %i ==0){
                return false;
            }else{
                i++;
                continue;
            }

        }
        return true;
    }
}
