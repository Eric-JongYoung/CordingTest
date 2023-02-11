package BaekJoon.step27_그래프와순회.ch09_미로탐색_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class N2178 {
    static int[][] dis;
    static boolean[][] visited;
    static int n, m;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());


        visited = new boolean[n][m];
        dis = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                dis[i][j] = s.charAt(j) -'0';
            }
        }
        visited[0][0] = true;
        bfs(0, 0);
        // 2. 출력

        System.out.println(dis[n-1][m-1]);

        br.close();
    }

    public static void bfs(int x, int y) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));

        while (!Q.isEmpty()) {
            Point tmp = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                // 벽에 부딪히거나, 범위를 넘어가면 pass
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }
                // 길이 아니거, 방문을 했다면 pass
                if (visited[nx][ny] || dis[nx][ny] == 0) {
                    continue;
                }
                    visited[nx][ny] = true;
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;

            }
        }
    }
}

class Point {
    public int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}