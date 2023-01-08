package step05.ch07_교육과정설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.println(T.solution(a, b));
    }

    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x : need.toCharArray()) {
            Q.offer(x);
        }
        for (char x : plan.toCharArray()) {
            if (Q.contains(x)) {
                if (x != Q.poll()) {
                    return "NO";
                }
            }
        }
        if(!Q.isEmpty()) return "NO";

        return answer;
    }
}