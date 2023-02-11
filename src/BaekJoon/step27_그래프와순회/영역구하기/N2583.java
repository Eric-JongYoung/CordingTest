package BaekJoon.step27_그래프와순회.영역구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N2583 {
    static int N, M, K;
    static int[] dx = {0, 1, 0, -1}; // x값이 변화 가능한 범위
    static int[] dy = {1, 0, -1, 0}; // y값이 변화 가능한 범위
    static boolean[][] visited; // 해당 칸을 지내갔으면 true
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 0. 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[M][N];
        visited = new boolean[M][N];
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 0;

        // 1. map에 그림 표시 하기
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            // 주어진 사각형의 끝점을 각각 for문을 돌면서 면적 부분에 1로 표시를합니다.
            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    map[y][x] = 1;
                }
            }
        }
        // 2. bfs 돌기 및 영역 데이터 뽑기
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && map[i][j] == 0) {
                    int area = bfs(new Point(i, j));
                    list.add(area);
                    cnt++;
                }
            }
        }

        // 4. 출력
        System.out.println(cnt);
        Collections.sort(list);
        for (int x : list) {
            System.out.print(x + " ");
        }
    }
    // 3. bfs 로 영역 구해보기
    public static int bfs(Point pt) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(pt);
        visited[pt.x][pt.y] = true;
        int area = 1; // area 가 1로 부터 시작한 이유는 이미 bfs로 들어왔다는거 자체가 1개 이상 이라는 것을 의미하므로
        while (!queue.isEmpty()) {
            Point tmp = queue.poll();
            int curX = tmp.x;
            int curY = tmp.y;
            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];
                if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
                    if (!visited[nx][ny] && map[nx][ny] == 0) {
                        visited[nx][ny] = true;
                        queue.offer(new Point(nx, ny));
                        area++;
                    }
                }
            }
        }
        return area; //해당 영역의 면적
    }
}
// 영역을 관리하기위해서 Point 라는 Class 로 관리
class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
