package step05.ch06_공주구하기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(T.solution(n,k));
    }

    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) Q.offer(i);
        while (!Q.isEmpty()) { //큐 가 비워지면 멈춤
            for (int i = 1; i < k; i++) {
                Q.offer(Q.poll()); // 꺼낸값을 다시 넣음
            }
            Q.poll();
            if (Q.size() == 1) {
                answer = Q.poll();
            }
        }
        return answer;
    }
}
