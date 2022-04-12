package programmers.Level1;

public class NewId {
    public String newid(String new_id) {

        //1단계
        String answer = new_id.toLowerCase();

        //2단계
        answer = answer.replaceAll("[~!@#$%^&*()=+\\[{\\]}:?,<>/]","");

        //3단계
        while(answer.contains("..")){
            answer = answer.replace("..",".");
        }

        //4단계

        if(answer.equals(".")){
            answer="";
        }
        if(!answer.equals("") && answer.charAt(0)=='.') {
            answer = answer.substring(1);
        }

        if(!answer.equals("") && answer.charAt(answer.length()-1)=='.'){
            answer = answer.substring(0,answer.length()-1);
        }


        //5단계
        if(answer.equals("")){
            answer="a";
        }

        //6단계
        if(answer.length()>=16){
            answer = answer.substring(0,15);
            if(answer.charAt(answer.length()-1)=='.'){
                answer = answer.substring(0,14);
            }
        }

        //7단계
        while(answer.length()<=2){
            answer = answer+answer.charAt(answer.length()-1);
        }
        return answer;
    }
}
