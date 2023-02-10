package BaekJoon.step27_그래프와순회.연결요소의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11724 {
    static int N, M;
    static boolean[] ch;
    static int[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[1001][1001];
        ch = new boolean[1001];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = graph[v][u] = 1;
        }
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            if (!ch[i]) {
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void dfs(int s) {
        ch[s] = true;
        for (int i = 1; i <= N; i++) {
            if (graph[s][i] == 1 && !ch[i]) {
                dfs(i);
            }
        }
    }
}
