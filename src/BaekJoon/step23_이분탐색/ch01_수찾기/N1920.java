package BaekJoon.step23_이분탐색.ch01_수찾기;


import java.util.Arrays;
import java.util.Scanner;

public class N1920 {
    public static void main(String[] args) {
        N1920 T = new N1920();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < m; i++) {
            System.out.println(T.solution(n,arr, b[i]));
        }
    }
    public int solution(int n, int[] arr, int bb) {
        int answer = 0;

        int lt = 0 , rt = n-1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == bb) {
                answer=1;
                break;
            }
            if(arr[mid]>bb) rt = mid - 1;
            else lt=mid+1;
        }
        return answer;
    }
}

