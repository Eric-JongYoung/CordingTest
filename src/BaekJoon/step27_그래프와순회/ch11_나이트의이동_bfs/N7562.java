package BaekJoon.step27_그래프와순회.ch11_나이트의이동_bfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N7562 {
    static boolean[][] visited; // 표시를 위한 배열
    static int l;
    static int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[][] chessboard;
    static Point knight, target;
    static StringTokenizer st;

    public static void bfs(Point knight) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(knight);
        visited[knight.x][knight.y] = true;
        while (!Q.isEmpty()) {
            Point tmp = Q.poll();
            int tmpX = tmp.x;
            int tmpY = tmp.y;
            int tmpCnt = tmp.cnt;

            if (tmpX == target.x && tmpY == target.y) {
                System.out.println(tmp.cnt);
                return;
            }
            for (int i = 0; i < 8; i++) {
                int nx = tmpX + dx[i];
                int ny = tmpY + dy[i];
                if (nx >= 0 && nx < l && ny >= 0 && ny < l && !visited[nx][ny]) {
                    Q.add(new Point(nx, ny, tmpCnt + 1));
                    visited[nx][ny] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            l = Integer.parseInt(br.readLine());
            chessboard = new int[l][l];
            visited = new boolean[l][l];
            st = new StringTokenizer(br.readLine());
            knight = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
            st = new StringTokenizer(br.readLine());
            target = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
            bfs(knight);
        }
        br.close();
    }
}

class Point {
    int x;
    int y;
    int cnt;

    public Point(int x, int y, int cnt) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}
