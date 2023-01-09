package inflearn.step01_String.ch09_숫자만추출;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }

    public int solution(String str) {
        str = str.toUpperCase().replaceAll("[A-Z]","");
        int anwser = Integer.parseInt(str);
        return anwser;
    }
}
