package Level1;

//https://programmers.co.kr/learn/courses/30/lessons/17681
//2018 KAKAO BLIND RECRUITMENT - 1차 비밀지도

public class SecretMap {
    public String[] secretMap(int n, int[] arr1, int[] arr2) {

        //정답이 담기는 배열
        String[] answer = new String[n];
        for(int i=0 ; i<n ;i++){
            answer[i] = "";
        }

        //arr1 , arr2의 이진수가 담기는 배열
        String[] answer1 = new String[n];
        String[] answer2 = new String[n];

        //arr1개수만큼 반복하여 이진수로 변환
        for(int i=0 ;i< n; i++){
            answer1[i] = change(arr1[i],n);
        }
        for(int i=0 ;i< n; i++){
            answer2[i] = change(arr2[i],n);
        }

        //둘다 0 이면 ' ' 하나라도 1이면 '#'
        for(int z =0; z<n ; z++){
            for(int k=0 ;k<n ; k++){
                if(answer1[z].charAt(k) =='0' && answer2[z].charAt(k) =='0'){
                    answer[z] = answer[z] +' ';
                }else{
                    answer[z] = answer[z] +'#';
                }
            }
        }
        return answer;
    }

    //이진수로 바꿔주는 함수
    public String change(int num,int size){
        String c ="";
        while(num >0){
            c =  num%2 + c;
            num = num / 2;
        }
        while(c.length() <size) {
            c = "0" + c;
        }
        System.out.println(c);
        return c;
    }
}
