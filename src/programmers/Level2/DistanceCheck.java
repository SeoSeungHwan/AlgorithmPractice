package programmers.Level2;

//https://programmers.co.kr/learn/courses/30/lessons/81302#fn1
//2021 카카오 채용연계형 인턴쉽 - 거리두기 확인하기
import java.util.*;

class Person{

    public int X = 0;
    public int Y = 0;

    public Person(int X , int Y){
        this.X = X;
        this.Y = Y;
    }
}

class DistanceCheck {
    public int[] distancecheck(String[][] places) {

        //정답을 저장할 배열
        int[] answer = new int[5];
        for(int i=0; i< 5; i++){
            answer[i] = 1;
        }

        //총 5번개의 대기실을 검사해야함
        for(int k=0; k<5 ; k++){

            //k번째 대기실을 2차원 배열로 나누기
            char[][] arr = new char[5][5];
            for(int i=0 ; i<5 ; i++){
                for(int j=0; j<5 ; j++){
                    arr[i][j] = places[k][i].charAt(j);
                }
            }


            //응시자의 정보(좌표)를 ArrayList에 저장
            ArrayList<Person> arrayList = new ArrayList<>();
            for(int i=0 ; i<5 ; i++){
                for(int j=0; j<5 ; j++){
                    if(arr[i][j] == 'P'){
                        Person person = new Person(i,j);
                        //System.out.println(k+"번째 " + person.X+","+person.Y);
                        arrayList.add(person);

                    }
                }
            }


            //각 응시자의 정보를 모든 응시자들의 정보와 비교
            for(int i=0; i< arrayList.size()-1; i++){
                for(int j=i+1 ; j<arrayList.size(); j++){
                    //만약 두사람의 거리가 2이하라면(맨하탄 거리에 걸렸으니 블라인드 확인해야함)
                    Person p1 = arrayList.get(i);
                    Person p2 = arrayList.get(j);
                    if(manhattan(p1,p2)){
                        int dx = p2.X-p1.X;
                        int dy = p2.Y-p1.Y;

                        //두 사람이 일직선 상에 있을 때
                        if(p1.Y==p2.Y){
                            if(arr[p1.X+(dx/2)][p1.Y] !='X'){
                                answer[k] =0;
                            }
                        }
                        else if(p1.X==p2.X){
                            if(arr[p1.X][p1.Y+(dy/2)] != 'X'){
                                answer[k] =0;
                            }
                        }
                        //두사람이 일직선상에 있지않을 경우
                        else{
                            //대각선으로 두 사람이 존재할 경우 그 주변 2개에 파티션이있는지 보고 없으면 0을 return
                            if(arr[p1.X+dx][p1.Y] !='X'){
                                answer[k] =0;
                            }else if(arr[p1.X][p1.Y+dy] !='X'){
                                answer[k] =0;

                            }
                        }
                    }
                    //만약 거리가 3이상이면 어짜피 안걸리니 무시
                    else{
                    }
                }
            }
        }
        return answer;
    }
    public boolean manhattan(Person p1, Person p2){
        //거리가 0,1,2 이면 true
        if((Math.abs(p1.X-p2.X) + Math.abs(p1.Y-p2.Y)) <3 ){
            return true;
        }
        //거리가 3이상이면 false
        else{
            return false;
        }
    }
}
