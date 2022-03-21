package Level2;

//https://programmers.co.kr/learn/courses/30/lessons/42860
//Greedy - 조이스틱

class JoyStick {
    public int joyStick(String name) {
        int answer = 0;
        int len = name.length();

        int move = len-1;
        for(int i=0; i<name.length(); i++){

            //상하 알파벳 변경에 대해 더 가까운것으로 결정
            answer += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);

            //다음 알파벳으로
            int nextA = i+1;

            //A가 연속이 된다면 앞으로 가는게 빠른지 뒤로가는게 빠른지 판단
            while(nextA < len && name.charAt(nextA) == 'A'){
                nextA++;
            }
            //그냥 뒤로 쭉가는것, 시작점으로 가서 끝으로 넘어가는것, 끝으로 가서 시작점으로 넘어가는 것 중 최소 찾기
            move = Math.min(Math.min(move,2 *i + len - nextA), i + 2 * (len -nextA));
        }
        answer += move;

        return answer;
    }
}