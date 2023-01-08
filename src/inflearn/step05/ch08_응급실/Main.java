package inflearn.step05.ch08_응급실;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
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
        Queue<Person> Q = new LinkedList<>();
        // Person 객체로 넣기.
        for (int i = 0; i < n; i++) {
            Q.offer(new Person(i, arr[i]));
        }
        while (!Q.isEmpty()) {
            Person tmp = Q.poll();
            //tmp 라는 환자가 진료를 받을 수 있는지 확인
            for (Person x : Q) {
                if (x.priority > tmp.priority) { // 진료 받으면 안되므로 큐에 다시 넣음
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) { // 진료 받을 수 있을때
                answer++;
                if(tmp.id==m) return answer;
            }
        }
        return answer;
    }
}

class Person{
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
