package programmers.Level1;

//https://programmers.co.kr/learn/courses/30/lessons/12916
//연습문제 - 문자열 내 p와 y의 개수
class PY {
    boolean py(String s) {

        int pnum =0;
        int ynum =0;

        String str = s.toLowerCase();
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i)=='p'){
                pnum++;
            }else if(str.charAt(i)=='y'){
                ynum++;
            }
        }

        if(pnum ==ynum){
            return true;
        }else{
            return false;
        }
    }
}