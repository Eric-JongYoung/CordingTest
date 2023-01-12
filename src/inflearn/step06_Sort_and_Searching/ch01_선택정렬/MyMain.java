package inflearn.step06_Sort_and_Searching.ch01_선택정렬;

import java.util.Arrays;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n,arr)) {
            System.out.print(x+" ");
        }
    }

    public int[] solution(int n, int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
