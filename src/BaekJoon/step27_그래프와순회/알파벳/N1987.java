package BaekJoon.step27_그래프와순회.알파벳;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N1987 {
    static int R, C;
    static int[][] graph;
    static boolean[] visited = new boolean[26]; // 알파벳이 26개 니까
    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, 1, -1, 0};
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        graph = new int[R][C];
        for (int i = 0; i < R; i++) {
            String tmp = br.readLine();
            for (int j = 0; j < C; j++) {
                graph[i][j] = tmp.charAt(j) - 'A';
            }
        }
        dfs(0, 0, 0);
        System.out.println(answer);
        br.close();
    }

    public static void dfs(int x, int y, int cnt) {
        if (visited[graph[x][y]]) { // 이미 지나간 알파벳이면 true
            answer = Math.max(answer, cnt); // 지나간 곳의 알파벳을 다시 만났다면 answer 는 cnt.
            return;
        } else {
            visited[graph[x][y]] = true; // 현재 말이 있는 곳의 알파벳 체크
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < R && ny < C) {
                    dfs(nx, ny, cnt + 1); // cnt 증가
                }
            }
            visited[graph[x][y]] = false; // 다른 루트로 dfs를 탐색하기 위해서
        }
    }
}