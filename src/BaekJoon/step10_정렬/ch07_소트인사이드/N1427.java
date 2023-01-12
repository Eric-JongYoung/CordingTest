package BaekJoon.step10_정렬.ch07_소트인사이드;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class N1427 {
    public static void main(String[] args) {
        N1427 T = new N1427();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println(T.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (true){
            arr.add(n%10);
            if(n<10){
                break;
            }
            n=n/10;
        }
        arr.sort(Collections.reverseOrder());
        String hello = "";
        for (int x : arr) {
            hello += String.valueOf(x);
        }
        answer = Integer.parseInt(hello);
        return answer;
    }
}
