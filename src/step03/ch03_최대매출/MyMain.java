package step03.ch03_최대매출;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,k,arr));
    }
    public int solution(int n, int k, int[] arr) {
        int max = Integer.MIN_VALUE;
        int tmp = 0;
        for(int i = k; i<n-k+1; i++){
            tmp = arr[i - 1] + arr[i] + arr[i + 1];
            if(tmp>max) max = tmp;
        }
        return max;
    }
}

