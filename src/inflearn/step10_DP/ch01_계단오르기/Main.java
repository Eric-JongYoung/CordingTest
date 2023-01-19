package inflearn.step10_DP.ch01_계단오르기;

import java.util.Scanner;

public class Main {
    static int[] dy;

    public int solution(int n) {
        dy[1] = 1; // 첫번째 계단 가는 수 -> 직관적으로 알 수 있음
        dy[2] = 2; // 두번째 계단 가는 수 -> 직관적으로 알 수 있음
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        return dy[n];
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dy = new int[n + 1];
        System.out.println(T.solution(n));
    }

}
