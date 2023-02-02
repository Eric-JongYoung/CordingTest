package BaekJoon.step27_그래프와순회.ch07_단지번호붙이기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class N2667 {
    static boolean[][] graph;
    static boolean[][] visited;
    static int n, countDanji;
    static int max = 25 + 10;
    static int[] dirX = {0, 0, 1, -1};
    static int[] dirY = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new boolean[max][max];
        visited = new boolean[max][max];
        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            for (int j = 1; j <= n; j++) {
                graph[i][j] = s.charAt(j - 1) == '1';
            }
        }
        // 1. (1,1) 부터 (n , n) 까지 돌면서 dfs
        ArrayList<Integer> countList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (graph[i][j] && !visited[i][j]) {
                    countDanji = 0;
                    dfs(i, j);
                    countList.add(countDanji);
                }
            }
        }
        // 2. 출력
        System.out.println(countList.size());
        Collections.sort(countList);
        for (int x : countList) {
            System.out.println(x);
        }
        br.close();
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        countDanji++;
        for (int i = 0; i < 4; i++) {
            int cx = x + dirX[i];
            int cy = y + dirY[i];
            if (!visited[cx][cy] && graph[cx][cy]) {
                dfs(cx, cy);
            }

        }
    }
}
