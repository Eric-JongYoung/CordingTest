package BaekJoon.step18_누적합.순서쌍의곱의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N13900 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] arr = new long[N + 1];
        long[] sum = new long[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            sum[i] = arr[i] + sum[i - 1];
        }
        long answer = 0;
        for (int i = 2; i <= N; i++) {
            answer += arr[i] * sum[i - 1];
        }
        System.out.println(answer);
        br.close();
    }
}
