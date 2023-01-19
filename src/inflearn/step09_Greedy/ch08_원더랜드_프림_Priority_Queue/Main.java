package inflearn.step09_Greedy.ch08_원더랜드_프림_Priority_Queue;

import java.util.*;

class Edge implements Comparable<Edge> {
    public int vex;
    public int cost;

    Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge ob) {
        return this.cost - ob.cost; // 최소값을 우선순위로 넣어줌
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }
        int[] ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c)); // 무방향 이라서 반대 경우도 추가해줘야함
        }
        int answer = 0;
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(1, 0));
        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            int ev = tmp.vex; // 도착 정점
            if (ch[ev] == 0) { // 회로가 되는것을 방지
                ch[ev] = 1;
                answer += tmp.cost; // 간선의 비용 누적
                for (Edge ob : graph.get(ev)) { // ev 와 연결된 다른 간선들 넣어주기
                    if (ch[ob.vex] == 0) pQ.offer(new Edge(ob.vex, ob.cost)); // 체크가 0 인 값만 넣어주기
                }
            }
        }
        System.out.println(answer);
    }
}