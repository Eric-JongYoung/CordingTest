package inflearn.step01.ch05_특정문자뒤집기;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(T.solution(str));
    }

    public String solution(String str){
        String anwser;
        char[] s = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;
        while (lt<rt){
            if(!Character.isAlphabetic(s[lt])) {
                lt++;
            }else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }

        }
        anwser = String.valueOf(s);
        return anwser;
    }
}
