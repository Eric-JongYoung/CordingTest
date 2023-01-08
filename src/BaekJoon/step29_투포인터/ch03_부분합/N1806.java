package BaekJoon.step29_투포인터.ch03_부분합;

import java.util.Scanner;

public class N1806 {
    public static void main(String[] args) {
        N1806 T = new N1806();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int s = kb.nextInt();

        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, s, arr));
    }

    public int solution(int n, int s, int[] arr) {
        int len = Integer.MAX_VALUE;
        int lt = 0, sum = 0, rt = 0;
        while (lt <= rt && rt <= n) {
            if (sum < s) {
                sum += arr[rt++];
            } else if (sum >= s) {
                len = Math.min(len, rt - lt);
                sum -= arr[lt++];
            }
        }
        return len==Integer.MAX_VALUE ? 0 : len;
    }
}
