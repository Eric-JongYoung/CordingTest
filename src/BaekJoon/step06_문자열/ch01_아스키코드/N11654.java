package BaekJoon.step06_문자열.ch01_아스키코드;

import java.util.Scanner;

public class N11654 {
    public static void main(String[] args) {
        N11654 T = new N11654();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        char[] an = str.toCharArray();
        System.out.println(an[0]-0);
    }
}
