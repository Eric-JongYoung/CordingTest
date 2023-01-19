package inflearn.step09_Greedy.ch07_원더랜드_크루스칼_Uion_Find;

import java.util.*;

class Edge implements Comparable<Edge> {
    public int v1;
    public int v2;
    public int cost;

    Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge ob) {
        return this.cost - ob.cost; // cost 오름차순 으로
    }
}

class Main {
    static int[] unf;

    /**
     * Union & Find 는 그냥 외워
     */
    public static int Find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        unf = new int[n + 1];
        ArrayList<Edge> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) unf[i] = i;
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            arr.add(new Edge(a, b, c));
        }
        int answer = 0; // 최소비용을 누적
        Collections.sort(arr); // cost 로 우선 정렬
//		int cnt = 0; -> 간선이 완료 되면 멈추게 하는 변수
        for (Edge ob : arr) {
            int fv1 = Find(ob.v1);
            int fv2 = Find(ob.v2);

            if (fv1 != fv2) { // 회로가 아닌 것들만 누적 -> 아닌것들은 그냥 지나쳐
                answer += ob.cost;
                Union(ob.v1, ob.v2);
//				cnt++;
            }
//			if(cnt==n-1) break;
        }
        System.out.println(answer);
    }
}