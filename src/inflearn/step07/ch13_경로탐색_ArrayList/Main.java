package inflearn.step07.ch13_경로탐색_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int v) {
        if(v==n) answer++;
        else {
            for (int nv : graph.get(v)) { // v 번 ArrayList 를 꺼내서 사용
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) { // 0~ 5 까지 넣을 것으로 생성
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1; // 출발점 체크
        T.DFS(1);
        System.out.println(answer);
    }
}
