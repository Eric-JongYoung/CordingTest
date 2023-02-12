package BaekJoon.step07_기본수학1.골드바흐의추측;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N6588 {
    static final int MAX = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean isPrime[] = new boolean[MAX];
        isPrime[0] = isPrime[1] = true; // 소수는 false
        for (int i = 2; i < isPrime.length; i++) {
            if (!isPrime[i]) {
                for (int j = i + i; j < isPrime.length; j += i) {
                    isPrime[j] = true;
                }
            }

        }
        int n = Integer.parseInt(br.readLine());
        while (n != 0) {
            boolean isProve = false;
            for (int i = 2; i <= n / 2; i++) {
                if (!isPrime[i] && !isPrime[n - i]) {
                    System.out.println(n + " = " + i + " + " + (n - i));
                    isProve = true;
                    break;
                }
            }

            if (!isProve) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
            n = Integer.parseInt(br.readLine());

        }
        br.close();
    }
}


