package programmers.Level1;

//https://programmers.co.kr/learn/courses/30/lessons/83201
//위클리 챌린지 2주차 - 상호평가
public class GradeCheck {
    class gradecheck {
        public String solution(int[][] scores) {
            String answer = "";


            for(int i=0; i< scores.length; i++){


                //최대 최소값 찾고 합구하기
                int sum =0;
                int max = scores[0][i];
                int min = scores[0][i];
                for(int k=0; k <scores[i].length; k++){
                    sum += scores[k][i];
                    if(scores[k][i]>max){
                        max = scores[k][i];
                    }
                    if(scores[k][i] < min){
                        min = scores[k][i];
                    }
                }

                //유일한 최소값 최대값인지 확인
                int count =0;
                if(scores[i][i] == max){
                    for(int j=0; j <scores[i].length; j++){
                        if(scores[j][i] == max){
                            count++;
                        }
                    }
                }
                else if(scores[i][i] ==min){
                    for(int j=0; j <scores[i].length; j++){
                        if(scores[j][i] == min){
                            count++;
                        }
                    }
                }


                //만약 유일한 최소값또는 최대값일 경우
                if(count == 1){
                    sum -= scores[i][i];
                    answer += grade(sum/(scores[i].length-1));

                }
                //만약 유일한 최소값또는 최대값이 아닐경우
                else{
                    answer += grade(sum/scores[i].length);
                }

            }
            return answer;
        }

        public String grade(int num){
            if(90<=num){
                return "A";
            }else if(80<=num && num <90){
                return "B";
            }else if(70<=num && num <80){
                return "C";
            }else if(50<=num && num <70){
                return "D";
            }else{
                return "F";
            }
        }
    }
}
