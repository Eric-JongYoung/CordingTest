package inflearn.step08_DFS_BFS_활용.ch08_수열추측하기;

import java.util.Scanner;

public class Main {
    static int[] b, p, ch;
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[35][35];

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        f = kb.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n + 1]; // 체크 배열
        for (int i = 0; i < n; i++) { // 콤비네이션 값 기본으로 넣기
            b[i] = T.combi(n - 1, i);
        }
        T.DFS(0, 0);
    }

    public int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }

    public void DFS(int L, int sum) {
        if (flag) return; // 필요없는 스텍들 제거
        if (L == n) {
            if (sum == f) {
                for (int x : p) System.out.print(x + " "); // 해당하는 배열 출력
                flag = true;  //필요없는 스텍들 제거
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1; // 체크
                    p[L] = i; // i 자체가 순열을 만드는 수
                    DFS(L + 1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }
}

