package BaekJoon.step06_문자열.ch02_숫자의합;

import java.util.Scanner;

public class N11720 {
    public static void main(String[] args) {
        N11720 T = new N11720();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        int answer = 0 ;
        for (char x : str.toCharArray()) {
            answer+=x-48;
        }
        System.out.println(answer);
    }
}
