package BaekJoon.step07_기본수학1.소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class N2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum =0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            if(isPrime(i)) {
                arr.add(i);
                sum += i;
            }
        }
        if(arr.size()==0){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(arr.get(0));
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
