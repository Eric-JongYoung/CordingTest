package BaekJoon.대회.KSA컵_winter_2023.A소수가아닌수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean flag = true;
        int cnt = N;

        while (flag) {
            if (!isPrime(cnt)) {
                System.out.println(cnt);
                flag = false;
            }
            cnt++;
        }
        br.close();
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
