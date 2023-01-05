package step01.ch11_문자열압축;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }

    public String solution(String s){
        String anwser = "";
        s = s + " ";
        int cnt = 1;
        for(int i = 0 ; i < s.length()-1 ; i++){
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            }else {
                anwser += s.charAt(i);
                if(cnt>1) anwser += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return anwser;
    }
}
