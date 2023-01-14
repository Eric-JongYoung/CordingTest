package BaekJoon.step06_문자열.ch09_평균은넘겠지;

import java.util.Scanner;

public class N4344 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int c = kb.nextInt();
        int[] arr;
        for (int i = 0; i < c; i++) {
            int n = kb.nextInt();
            arr = new int[n];
            double sum = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = kb.nextInt();
                sum += arr[j];
            }
            double cnt =0;
            double avg = (sum/n);
            for (int j = 0; j < n; j++) {
                if(arr[j]>avg) cnt++;
            }
            System.out.printf("%.3f%%\n",(cnt/n)*100);
        }
    }
}
