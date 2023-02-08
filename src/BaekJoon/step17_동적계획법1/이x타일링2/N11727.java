package BaekJoon.step17_동적계획법1.이x타일링2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class N11727 {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        int k = 1000;
        dp = new int[k + 1];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 3;
        for (int i = 3; i <= n; i++) {
            dp[i] = (2 *dp[i - 2] + dp[i - 1]) % 10007;
        }
        System.out.println(dp[n]);
        br.close();
    }
}
