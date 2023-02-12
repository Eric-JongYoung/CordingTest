package BaekJoon.대회.KSA컵_winter_2023.C_수학퀴즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int p = 0, q = 0;
        for (int x : arr) {
            if (x % 3 == 0) {
                q++;
            } else if (x % 3 == 1) {
                p++;
            } else if (x % 3 == 2) {
                p--;
                q--;
            }
        }
        System.out.println(p + " " + q);
        br.close();
    }
}
