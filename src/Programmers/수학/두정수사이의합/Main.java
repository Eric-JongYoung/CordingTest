package Programmers.수학.두정수사이의합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int a = kb.nextInt();
        int b = kb.nextInt();

        System.out.println(T.solution(a, b));
    }

    public long solution(int a, int b) {
        return sum(Math.min(a, b), Math.max(a, b));
    }

    public long sum(long a, long b) {
        return (b - a + 1) * (a + b) /2;
    }
}
