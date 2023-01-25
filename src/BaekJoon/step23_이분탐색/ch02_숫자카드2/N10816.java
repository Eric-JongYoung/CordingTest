package BaekJoon.step23_이분탐색.ch02_숫자카드2;


import java.util.Arrays;
import java.util.Scanner;

public class N10816 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr);
        int m = kb.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int target = kb.nextInt();
            sb.append(upperBound(arr, target) - lowerBound(arr, target)).append(' ');
        }
        System.out.println(sb);
    }

    public static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (target <= arr[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (target < arr[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

