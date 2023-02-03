package BaekJoon.step17_동적계획법1.ch05_연속합;

import java.util.Scanner;

public class N1912 {
    static int[] arr, dp;
    static int max;

    public static int solution(int n) {
        dp[0] = arr[0];
        max = arr[0];

        for (int i = 1; i < n; i++) {
            // (이전 dp + 현재 arr값) 과 현재 arr값 중 큰 것을 dp에 저장
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
            // 최댓값 갱신
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        arr = new int[n];
        dp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(solution(n));
    }
}

