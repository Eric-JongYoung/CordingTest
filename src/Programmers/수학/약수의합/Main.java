package Programmers.수학.약수의합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer+n;
    }
}
