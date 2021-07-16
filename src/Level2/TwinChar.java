package Level2;

import java.util.*;


//2017팁스타운 - 짝지어 제거하기
//https://programmers.co.kr/learn/courses/30/lessons/12973

public class TwinChar {

    public int twinchar(String s)
    {
        Stack<String> stack = new Stack<>();

        for(int i=0 ; i<s.length(); i++){
            if(stack.empty()){
                stack.push(String.valueOf(s.charAt(i)));
            }else{
                String last = stack.peek();
                String current = String.valueOf(s.charAt(i));
                if(!last.equals(current)){
                    stack.push(current);
                }else{
                    stack.pop();
                }
            }

        }

        return stack.size() == 0 ? 1 : 0;
    }

    /*
    시간초과된 정답
    String str = s;

    int length =0;
        while(length != str.length()){
        length = str.length();
        for(int i=97 ; i<123 ; i++){
            char a = (char)i;
            String aa = a + "" + a;
            str = str.replaceAll(aa,"");
        }
    }
        if(str.length() ==0){
        return 1;
    }else{
        return 0;
    }*/

    /*
    시간초과 정답 2
    String str = s;
        while(str.length() !=0){

        char c = str.charAt(0);
        int cindex = 0;
        boolean a = true;
        for(int i=1 ; i< str.length() ; i++){
            if(c == str.charAt(i)){
                str = str.substring(0,cindex) + str.substring(i+1,str.length());
                a = false;
                break;
            }
            c = str.charAt(i);
            cindex = i;
        }
        if(a){
            return 0;
        }
    }
        return 1;*/


}
