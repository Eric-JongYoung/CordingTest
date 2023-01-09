package inflearn.step07_DFS_BFS.ch12_경로탐색_DFS;

import java.util.Scanner;

public class Main {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {
        if(v==n) answer++;
        else { //뻣아 나감
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i]=1; //방문했다고 체크
                    DFS(i);
                    ch[i]=0; // 백할때 이전에 방문했던 지점 체크 해제
                }
            }
        }
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n + 1][n + 1]; // 정점 번호를 의미
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1; // 출발점 체크
        T.DFS(1);
        System.out.println(answer);
    }
}
