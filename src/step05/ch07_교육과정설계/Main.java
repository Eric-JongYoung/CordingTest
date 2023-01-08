package step05.ch07_교육과정설계;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
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
                if (x != Q.poll()) { // need 에 있지만, Queue 의 만 앞의 값이 아니라면 리턴
                    return "NO";
                }
            }
        }
        if (!Q.isEmpty()) { // 필수과목 이수 안했으면
            return "NO";
        }
        return answer;
    }
}
