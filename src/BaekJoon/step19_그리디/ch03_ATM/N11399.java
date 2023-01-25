package BaekJoon.step19_그리디.ch03_ATM;

import java.util.Arrays;
import java.util.Scanner;

public class N11399 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr);
        int answer = 0;
        int wait = 0;
        for (int i = 0; i < n; i++) {
            wait += arr[i];
            answer += wait;
        }
        System.out.println(answer);
    }
}
