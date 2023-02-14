package BaekJoon.step07_기본수학1.골드바흐의추측2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9020 {
    static final int MAX = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        boolean isPrime[] = new boolean[MAX];
        isPrime[0] = isPrime[1] = true; // 소수는 false
        for (int i = 2; i < isPrime.length; i++) {
            if (!isPrime[i]) {
                for (int j = i + i; j < isPrime.length; j += i) {
                    isPrime[j] = true;
                }
            }

        }

        int n;
        for (int j = 0; j < tc; j++) {
            n = Integer.parseInt(br.readLine());
            boolean isProve = false;
            for (int i = n/2; i >= 2; i--) {
                if (!isPrime[i] && !isPrime[n - i]) {
                    System.out.println(i + " " + (n - i));
                    isProve = true;
                    break;
                }
            }
        }
        br.close();
    }
}


