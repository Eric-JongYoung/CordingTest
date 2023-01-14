package BaekJoon.step18_누적합.ch01_구간합구하기4;

import java.util.Scanner;

public class N11659 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n+1];
        int[] sum = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = kb.nextInt();
            sum[i] += sum[i-1] + arr[i];
        }

        int a,b;
        int[] answer = new int[m+1];
        for (int i = 1; i <= m; i++) {
            a = kb.nextInt();
            b = kb.nextInt();
            answer[i] = sum[b] - sum[a-1];
        }
        for (int i = 1; i <= m; i++) {
            System.out.println(answer[i]);
        }
    }
}
/*
* 누적합 이용..
* */