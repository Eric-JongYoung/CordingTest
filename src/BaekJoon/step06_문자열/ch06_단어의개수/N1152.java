package BaekJoon.step06_문자열.ch06_단어의개수;

import java.util.Scanner;

public class N1152 {
    public static void main(String[] args) {
        N1152 T = new N1152();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }

    public int solution(String str) {
        int answer = 1;

        char[] s = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if(s[i]==' ') answer++;
        }
        if(s[0]==' ') answer --;
        if(s[s.length-1]== ' ') answer --;
        return answer;
    }
}
