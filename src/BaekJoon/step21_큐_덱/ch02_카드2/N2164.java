package BaekJoon.step21_큐_덱.ch02_카드2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N2164 {
    public static void main(String[] args) {
        N2164 T = new N2164();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }

    public int solution(int n) {
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            Q.offer(i);
        }
        while (Q.size()>1) {
            Q.poll();
            Q.offer(Q.poll());
        }
        return Q.poll();
    }
}
