package BaekJoon.step27_그래프와순회.ch05_바이러스_dfs;

import java.io.*;
import java.util.StringTokenizer;

class N2606 {
    static boolean[][] graph;
    static boolean[] visited;
    static int n;
    static int m;
    static int answer;

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        // 1. 그래프 정보 입력
        graph = new boolean[n + 1][n + 1];
        visited = new boolean[n + 1];
        int x, y;
        StringTokenizer st;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = true;
        }

        // 2. dfs 및 결과 출력
        dfs(1);

        bw.write(String.valueOf(answer-1));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int idx) {
        answer++;
        visited[idx] = true;
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && graph[idx][i]) {
                dfs(i);
            }
        }
    }
}
