package BaekJoon.보라매컵2023.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }

    public int solution(int n, int[] arr) {
        int answer = 0;
        for (int i = 0; i < 3; i++) {
            if ((n - arr[i]) >= 0) {
                answer += arr[i];
            }else {
                answer += n;
            }
        }

        return answer;
    }
}
