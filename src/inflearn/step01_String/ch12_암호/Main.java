package inflearn.step01_String.ch12_암호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
    public String solution(int n, String str){
        String anwser = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7)
                    .replace('#','1')
                    .replace('*','0');
            // 2진수 값을 변환한다는 뜻
            int num = Integer.parseInt(tmp, 2);
            anwser += (char) num;
            str = str.substring(7);
        }
        return anwser;
    }
}
