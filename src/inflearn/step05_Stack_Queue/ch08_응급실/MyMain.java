package inflearn.step05_Stack_Queue.ch08_응급실;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Human> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.offer(new Human(i, arr[i]));
        }
        while (!Q.isEmpty()) {
            Human tmp = Q.poll();
            for (Human x : Q) {
                if (x.priority > tmp.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id==m) return answer;
            }
        }
        return answer;
    }
}

class Human{
    int id;
    int priority;

    public Human(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}