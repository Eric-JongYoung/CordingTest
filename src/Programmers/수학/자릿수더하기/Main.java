package Programmers.수학.자릿수더하기;

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
        while (true) {
            answer+=n%10;
            if (n < 10) {
                break;
            }
            n=n/10;
        }
        return answer;
    }
}