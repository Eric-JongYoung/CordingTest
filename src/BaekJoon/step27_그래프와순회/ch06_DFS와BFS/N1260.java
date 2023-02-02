package BaekJoon.step27_그래프와순회.ch06_DFS와BFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class N1260 {
    static boolean[][] graph;
    static boolean[] visited;
    static int n, m, v;
    static Queue<Integer> Q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        // 1. 그래프 정보 입력
        graph = new boolean[n + 1][n + 1];
        visited = new boolean[n + 1];
        int x, y;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = true;
        }

        // 2. dfs 및 결과 출력
        dfs(v);
        System.out.println();

        visited = new boolean[n + 1];
        // 3. bfs 및 결과 출력
        bfs(v);
        br.close();
    }

    public static void dfs(int idx) {
        visited[idx] = true;
        System.out.print(idx + " ");
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && graph[idx][i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int idx) {
        Q.offer(idx);
        visited[idx] = true;

        while (!Q.isEmpty()) {
            idx = Q.poll();
            System.out.print(idx + " ");
            for (int i = 1; i <= n; i++) {
                if (!visited[i] && graph[idx][i]) {
                    Q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
