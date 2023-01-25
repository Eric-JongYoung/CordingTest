package BaekJoon.step17_동적계획법1.ch08_계단오르기;

import java.util.Scanner;

public class N2579 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] dp = new int[n + 1];
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = kb.nextInt();
        }
        dp[1] = arr[1];
        if (n >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + arr[i - 1]) + arr[i];
        }
        System.out.println(dp[n]);
    }
}
