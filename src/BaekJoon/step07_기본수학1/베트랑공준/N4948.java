package BaekJoon.step07_기본수학1.베트랑공준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4948 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n==0) break;
            int ans = 0;
            for(int i = n +1 ; i <= 2*n ; i++){
                if(isPrime(i)) ans++;
            }
            System.out.println(ans);
        }

        br.close();
    }

    public static boolean isPrime(int n) {
        if(n==1) return false;
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
