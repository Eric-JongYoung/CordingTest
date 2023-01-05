package step02.ch07_점수계산;

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
        System.out.println(T.solution(n, arr));
    }

    public int solution(int n, int[] arr) {
        int anwser = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                anwser += cnt;
            } else {
                cnt = 0;
            }
        }
        return anwser;
    }
}
