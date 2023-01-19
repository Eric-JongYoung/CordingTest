package inflearn.step09_Greedy.ch06_친구인가_Union_Find;

import java.util.*;

class Main {
    static int[] unf;

    public static int Find(int v) { // 집합 번호를 리턴
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v]); // 경로 압축
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unf[fa] = fb; // 서로 집합 번호가 다르면, 같은 집합으로 표현
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) unf[i] = i; // unf 초기 값으로 집합번호에 자기 번호를 넣어둠
        for (int i = 1; i <= m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            Union(a, b); // a 와 b는 친구 관계니까 하나의 집합으로 만들어라 Union
        }
        int a = kb.nextInt();
        int b = kb.nextInt();
        int fa = Find(a);
        int fb = Find(b);
        if (fa == fb) System.out.println("YES");
        else System.out.println("NO");
    }
}
/**
 * 외워서 푸는 문제
 * */