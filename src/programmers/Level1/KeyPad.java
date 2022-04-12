package programmers.Level1;

//https://programmers.co.kr/learn/courses/30/lessons/67256
//2020 카카오 인턴쉽 - 키배드 누르기
class KeyPad {
    public String keypad(int[] numbers, String hand) {

        char[] answer_arr = new char[numbers.length];
        int[][] arr = {{1,2,3},
                {4,5,6},
                {7,8,9},
                {-1,0,-2}};

        //왼손 오른쪽 시작지점 초기화
        int left = -1;
        int right = -2;
        int index=0;

        for(int k=0 ; k<numbers.length;k++){
            //1,4,7이면 왼손
            if(numbers[k] == 1 || numbers[k] ==4 || numbers[k] ==7){
                answer_arr[index++] = 'L';
                left = numbers[k];
            }
            //3,6,9면 오른손
            else if(numbers[k] ==3||numbers[k] ==6||numbers[k] ==9){
                answer_arr[index++] ='R';
                right = numbers[k];
            }
            //2,5,8,0이면 더가까운손으로 누르기
            else{
                int push_i =0;
                int push_j =0;
                int left_i =0;
                int left_j =0;
                int right_i =0;
                int right_j =0;

                for(int i=0 ; i<4 ; i++){
                    for(int j=0 ; j<3; j++){
                        if(arr[i][j] == numbers[k]){
                            push_i =i;
                            push_j =j;
                        }
                        if(arr[i][j] == left){
                            left_i =i;
                            left_j =j;
                        }
                        if(arr[i][j] == right){
                            right_i =i;
                            right_j =j;
                        }
                    }
                }
                //절대값을 사용하여 더가까운쪽 구하기
                if((Math.abs(push_i-left_i) + Math.abs(push_j-left_j)) >
                        (Math.abs(push_i-right_i) + Math.abs(push_j-right_j))){
                    answer_arr[index++] ='R';
                    right = numbers[k];
                }
                else if((Math.abs(push_i-left_i) + Math.abs(push_j-left_j)) <
                        (Math.abs(push_i-right_i) + Math.abs(push_j-right_j))){
                    answer_arr[index++] ='L';
                    left = numbers[k];
                }
                //두거리가 같으면 왼손잡이 오른손잡이 판별하여 클릭
                else{
                    if(hand.equals("right")){
                        answer_arr[index++] ='R';
                        right = numbers[k];
                    }else{
                        answer_arr[index++] ='L';
                        left = numbers[k];
                    }
                }

            }
        }
        //문자 배열을 문자열로 변환
        String answer = new String(answer_arr);
        return answer;
    }
}