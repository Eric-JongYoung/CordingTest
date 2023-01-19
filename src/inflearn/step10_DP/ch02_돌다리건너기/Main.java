package inflearn.step10_DP.ch02_돌다리건너기;

import java.util.Scanner;

public class Main {
    static int[] dy;

    public int solution(int n) {
        dy[1] = 1; // 첫번째 계단 가는 수 -> 직관적으로 알 수 있음
        dy[2] = 2; // 두번째 계단 가는 수 -> 직관적으로 알 수 있음
        for (int i = 3; i <= n + 1; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        return dy[n + 1];
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dy = new int[n + 2];
        System.out.println(T.solution(n));
    }
}
/**
 * 개울 건너는건 마지막 돌 넘어서 가야함
 */
