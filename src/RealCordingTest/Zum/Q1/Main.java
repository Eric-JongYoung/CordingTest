package RealCordingTest.Zum.Q1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }

    public long solution(int n) {
        long answer = 0;
        for (int i = 1; i <= 100000; i++) {
            if((i%n)==(i/n)) answer+=i;
        }
        return answer;
    }
}

