package RealCordingTest.Crema.Exam.Q5;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n, m, s;
    static ArrayList<ArrayList<Integer>> graph;
    static int [] ch , dis;
    static int cnt;

    public static void BFS(int v) {
        Queue<Integer> Q = new LinkedList<>();
        ch[v]=1;
        dis[v] = 0;
        Q.offer(v);
        while (!Q.isEmpty()) {
            int cv = Q.poll(); // 현재 지점
            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    Q.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
            cnt++;
        }

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        s = kb.nextInt();

        int[][] arr = new int[m + 1][s + 1];

        for (int i = 1; i <= n; i++) {

        }
        System.out.println(cnt);
    }

}
