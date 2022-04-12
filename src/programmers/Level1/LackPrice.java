package programmers.Level1;

//위클리 챌린지 1주차 - 부족한 금액 계산하기
//https://programmers.co.kr/learn/courses/30/lessons/82612
class LackPrice {
    public long lackprice(int price, int money, int count) {

        long sum =0;
        for(int i=0; i< count ; i++){
            sum += price*(i+1);
        }

        if(sum > money){
            return sum -money;
        }else{
            return 0;
        }
    }
}