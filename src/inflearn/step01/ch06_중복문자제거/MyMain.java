package inflearn.step01.ch06_중복문자제거;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
    public String solution(String str){
        String answer = "";

        for(int i = 0 ; i < str.length() ; i ++){
//            System.out.println(str.charAt(i)+ " " + i + " "+ str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i){
                answer += str.charAt(i);
            }
        }

        return answer;
    }
}
