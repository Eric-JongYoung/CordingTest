package BaekJoon.Step11_재귀.ch02_피보나치수5;

import java.util.Scanner;

public class N10870 {
    public static void main(String[] args) {
        N10870 T = new N10870();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }

    public int solution(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return solution(n - 1) + solution(n - 2);
    }
}
