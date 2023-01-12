package BaekJoon.step10_정렬.ch03_커트라인;


import java.util.Scanner;

public class N25305 {
    public static void main(String[] args) {
        N25305 T = new N25305();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k , arr));
    }

    public int solution(int n,int k, int[] arr) {
        for (int i = 1; i < n; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] < tmp) {
                    arr[j + 1] = arr[j];
                }else break;
            }
            arr[j + 1] = tmp;
        }
        return arr[k-1];
    }
}
