package inflearn.step08_DFS_BFS_활용.ch07_조합의경우수_메모이제이션;

import java.util.Scanner;

public class Main {
    int[][] dy = new int[35][35];
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        System.out.println(T.DFS(n, r));
    }

    public int DFS(int n, int r) {
        if(dy[n][r]>0) return dy[n][r]; // 이미 저장된 값이면 바로 해당 값을 내보내라.
        if (n == r || r ==0 ) return 1;
        else return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
    }
}

/**
 * 한번 구해진 값은 2차원 배열에 기록
 * */