package BaekJoon.step10_정렬.ch01_수정렬하기;

import java.util.Scanner;
import java.util.TreeSet;

public class N2750 {
    public static void main(String[] args) {
        N2750 T = new N2750();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.println(x);
        }
    }

    public TreeSet<Integer> solution(int n, int[] arr) {
        TreeSet<Integer> Tset = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            Tset.add(arr[i]);
        }

        return Tset;
    }
}
