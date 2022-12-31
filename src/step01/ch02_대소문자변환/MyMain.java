package step01.ch02_대소문자변환;

import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(T.solution(str));
    }

    public static String solution(String str){
        String anwser = "";
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
                anwser += String.valueOf(c);
            }else {
                c = Character.toUpperCase(c);
                anwser += String.valueOf(c);
            }
        }
        return anwser;
    }
}
