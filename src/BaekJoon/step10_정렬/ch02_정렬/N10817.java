package BaekJoon.step10_정렬.ch02_정렬;

import java.util.Scanner;

public class N10817 {
    public static void main(String[] args) {
        N10817 T = new N10817();
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr));
    }

    public int solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                }else break;
            }
            arr[j + 1] = tmp;
        }
        return arr[1];
    }
}
