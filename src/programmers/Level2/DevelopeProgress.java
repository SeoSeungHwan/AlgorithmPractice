package programmers.Level2;

//https://programmers.co.kr/learn/courses/30/lessons/42586
//스텍,큐 - 기능개발

class DevelopeProgress {
    public int[] developeProgress(int[] progresses, int[] speeds) {
        int[] temp = new int[100];
        int day = 0;
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (speeds[i] * day) < 100) {
                day++;
            }
            temp[day]++;
        }

        int count = 0;

        for (int n : temp) {
            if (n != 0) count++;
        }

        int[] answer = new int[count];

        count = 0;
        for (int n : temp) {
            if (n != 0) answer[count++] = n;
        }
        return answer;
    }
}