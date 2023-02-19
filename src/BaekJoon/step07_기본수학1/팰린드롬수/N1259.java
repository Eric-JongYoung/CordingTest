package BaekJoon.step07_기본수학1.팰린드롬수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true){
         int N = Integer.parseInt(br.readLine());
         if(N==0) break;
         if(isPalindrome(N)) System.out.println("yes");
         else System.out.println("no");
        }


        br.close();
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
