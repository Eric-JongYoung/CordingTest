package BaekJoon.step23_이분탐색.ch02_숫자카드2;

import java.util.HashMap;
import java.util.Scanner;

public class N10816_HashMap {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }
        for (int x : solution(a, b)) {
            System.out.print(x + " ");
        }
    }

    public static int[] solution(int[] a, int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : b) {
            map.put(x, map.getOrDefault(x, 0));
        }
        for (int x : a) {
            if (map.get(x) != null) {
                map.put(x, map.get(x) + 1);
            }
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = map.get(b[i]);
        }
        return b;
    }
}
/*
* 시간 초과로 안풀림
* */
