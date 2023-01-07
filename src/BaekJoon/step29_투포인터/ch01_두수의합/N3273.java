package BaekJoon.step29_투포인터.ch01_두수의합;

import java.util.Arrays;
import java.util.Scanner;

public class N3273 {
    public static void main(String[] args) {
        N3273 T = new N3273();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        int x = kb.nextInt();
        System.out.println(T.solution(n, arr, x));
    }

    public int solution(int n, int[] arr, int x) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = n - 1;
        while (lt < rt) {
            int sum = arr[lt] + arr[rt];
            if (sum == x) {
                answer++;
                lt++;
                rt--;
            } else if (sum > x) {
                rt--;
            }else {
                lt++;
            }
        }
        return answer;
    }
}
