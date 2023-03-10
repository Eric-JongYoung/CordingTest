package inflearn.step01_String.ch07_회문문자열;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
        System.out.println(T.solution2(str));
    }
    public String solution(String str){
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for(int i = 0 ; i < len ; i ++ ){
            if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
        }
        return answer;
    }
    public String solution2(String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) {
            return "YES";
        }
        return answer;
    }
}
