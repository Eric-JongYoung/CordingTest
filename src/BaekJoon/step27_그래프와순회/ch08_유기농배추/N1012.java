package BaekJoon.step27_그래프와순회.ch08_유기농배추;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class N1012 {
    static boolean[][] graph;
    static boolean[][] visited;
    static int n, m, k, answer;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            // 1. 그래프 정보 입력
            graph = new boolean[m][n];
            visited = new boolean[m][n];
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = true;
            }

            for (int g = 0; g < m; g++) {
                for (int h = 0; h < n; h++) {
                    if (graph[g][h] && !visited[g][h]) {
                        dfs(g, h);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
        br.close();
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int cx = x + dx[i];
                int cy = y + dy[i];
                if (cx >= 0 && cy >= 0 && cx < m && cy < n) {
                    if (!visited[cx][cy] && graph[cx][cy]) {
                        dfs(cx, cy);
                    }
                }
            }
        }
    }

}
