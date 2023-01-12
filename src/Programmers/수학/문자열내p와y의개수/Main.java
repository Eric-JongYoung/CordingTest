package Programmers.수학.문자열내p와y의개수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(T.solution(str));
    }

    public boolean solution(String str) {
        boolean answer = true;
        str = str.toLowerCase();
        int p = 0;
        int y = 0;
        if(!str.contains("p") && !str.contains("y")) return true;
        for (char x : str.toCharArray()) {
            if(x=='p') p++;
            else if(x=='y') y++;
        }
        if (p!=y) answer = false;

        return answer;
    }
    boolean solution2(String s) {

        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
