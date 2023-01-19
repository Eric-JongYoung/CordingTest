package inflearn.step09_Greedy.ch02_회의실배정;


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
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Time(x, y));
        }
        System.out.println(T.solution(arr,n));
    }

    public int solution(ArrayList<Time> arr, int n) {
        int cnt = 0 ;
        Collections.sort(arr);
        int endTime = 0;
        for (Time ob : arr) {
            if(ob.s>=endTime){
                cnt++;
                endTime = ob.e;
            }
        }
        return cnt;
    }
}

class Time implements Comparable<Time> {
    public int s, e;

    public Time(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time o) {
        if(this.e==o.e) return this.s-o.s; // 끝나는시간이 같으면 오름차순
        else return this.e-o.e;
    }
}
