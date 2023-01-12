package Programmers.수학.자연수뒤집어배열로만들기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int x : T.solution(n)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int n) {
        char[] s = String.valueOf(n).toCharArray();
        int lt = 0;
        int rt = s.length -1;
        while (lt < rt) {
            char tmp = s[lt];
            s[lt] = s[rt];
            s[rt] = tmp;
            lt++;
            rt--;
        }
        int[] answer = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            answer[i] = s[i]-48;
        }
        return answer;
    }

    public int[] solution2(int n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
