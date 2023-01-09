package inflearn.step02_Arrays.ch03_가위바위보;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = kb.nextInt();
        }
        for (char x : T.solution(n, a, b).toCharArray()) {
            System.out.println(x);
        }
    }

    public String solution(int n, int[] a, int[] b) {
        String anwser = "";
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) anwser += "D";
            else if (a[i] == 1 && b[i] == 3) anwser += "A";
            else if (a[i] == 2 && b[i] == 1) anwser += "A";
            else if (a[i] == 3 && b[i] == 2) anwser += "A";
            else anwser += "B";
        }

        return anwser;
    }
}