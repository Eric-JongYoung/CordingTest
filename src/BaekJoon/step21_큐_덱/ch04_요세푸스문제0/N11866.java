package BaekJoon.step21_큐_덱.ch04_요세푸스문제0;



import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N11866 {
    public static void main(String[] args) {
        N11866 T = new N11866();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();

        T.solution(n, k);
    }

    public void solution(int n, int k) {
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            Q.offer(i);
        }
        System.out.print("<");
        while (Q.size()>0) {
            for (int i = 1; i < k; i++) {
                Q.offer(Q.poll());
            }
            System.out.print(Q.poll());
            if (Q.size() >0) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}
