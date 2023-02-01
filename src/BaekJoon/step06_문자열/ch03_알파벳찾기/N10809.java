package BaekJoon.step06_문자열.ch03_알파벳찾기;

import java.util.Scanner;
public class N10809 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        for (int i = 0; i < 26; i++) {
            char tmp = (char) (i + 97);
            System.out.print(str.indexOf(tmp) + " ");
        }
    }
}