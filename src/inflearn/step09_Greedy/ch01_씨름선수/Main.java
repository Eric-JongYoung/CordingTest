package inflearn.step09_Greedy.ch01_씨름선수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = kb.nextInt();
            int w = kb.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(T.solution(arr, n));

    }

    public int solution(ArrayList<Body> arr, int n) {
        int cnt = 0 ;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for (Body ob : arr) {
            if(ob.w>max){ // 최대값이 발견 될때만 count
                max = ob.w;
                cnt++;
            }
        }
        return cnt;
    }

}
class Body implements Comparable<Body>{
    public int h, w;

    public Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h-this.h; // 키 기준 내림차순
    }
}