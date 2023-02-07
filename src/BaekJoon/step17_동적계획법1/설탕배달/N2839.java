package BaekJoon.step17_동적계획법1.설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        if (n == 4 || n == 7) {
            return -1;
        } else if (n % 5 == 0) {
            return n / 5;
        } else if (n % 5 == 1 || n % 5 == 3) {
            return (n / 5) + 1;
        } else if (n % 5 == 2 || n % 5 == 4) {
            return (n / 5) + 2;
        }
        return -1;
    }
}