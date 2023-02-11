package BaekJoon.step27_그래프와순회.ch10_숨바꼭질_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N1697 {
    static int[] ch; // 표시를 위한 배열
    static Queue<Integer> Q = new LinkedList<>();
    static int max = 1000000; // 왜냐면 좌표가 10000까지 니까

    public static int bfs(int N, int K) {
        if (N == K) return 0;
        ch = new int[max + 1];
        ch[N] = 1;
        Q.offer(N);
        int L = 0; // Root Node 는 레벨이 0 이니까
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for (int j = 0; j < 3; j++) { // 종류가 3가지 니까
                    int nx;
                    if (j == 0) {
                        nx = x + 1;
                    } else if (j == 1) {
                        nx = x - 1;
                    } else {
                        nx = x * 2;
                    }
                    if (nx == K) return L + 1; // 해당 값이 나온 다음 L 이 정답이니까.
                    if (nx >= 0 && nx <= max && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int K = kb.nextInt();
        System.out.println(bfs(N, K));
    }
}
