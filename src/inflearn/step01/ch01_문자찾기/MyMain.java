package inflearn.step01.ch01_문자찾기;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        char c = in.nextLine().charAt(0);

        input1 = input1.toUpperCase();
        c = Character.toUpperCase(c);

        System.out.println(countChar(input1, c));

    }

    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
