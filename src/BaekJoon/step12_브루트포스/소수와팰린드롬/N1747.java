package BaekJoon.step12_브루트포스.소수와팰린드롬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = N;
        while (true) {
            if (isPalindrome(answer) && isPrime(answer)) {
                System.out.println(answer);
                break;
            }
            answer++;
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
    public static boolean isPalindrome(int n){
        String str = String.valueOf(n);
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            return true;
        }else {
            return false;
        }
    }
}
