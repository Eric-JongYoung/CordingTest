package BaekJoon.step06_문자열.ch07_상수;

import java.util.Scanner;
import java.util.stream.Stream;

public class N2908 {
    public static void main(String[] args) {
        N2908 T = new N2908();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        System.out.println(T.solution(a,b));
    }

    public int solution(int a, int b) {
        return Math.max(cal(a),cal(b));
    }
    public int cal(int num){
        int [] arr = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        return arr[2]*100 + arr[1]*10 + arr[0];
    }
}
