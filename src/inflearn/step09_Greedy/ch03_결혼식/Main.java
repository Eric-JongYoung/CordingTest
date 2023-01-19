package inflearn.step09_Greedy.ch03_결혼식;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sT = kb.nextInt();
            int eT = kb.nextInt();
            arr.add(new Time(sT, 's'));
            arr.add(new Time(eT, 'e'));
        }
        System.out.println(T.solution(arr));
    }

    public int solution(ArrayList<Time> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0; //현재 에 있는 인원수
        for (Time ob : arr) {
            if(ob.state=='s') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }

        return answer;
    }

}

class Time implements Comparable<Time> {
   public int time;
   public char state;

    public Time(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time ob) {
        if(this.time==ob.time) return this.state - ob.state; // 시간이 같을때 알파벳 정렬
        else return this.time - ob.time;
    }
}