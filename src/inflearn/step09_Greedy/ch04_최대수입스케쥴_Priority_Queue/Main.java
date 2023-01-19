package inflearn.step09_Greedy.ch04_최대수입스케쥴_Priority_Queue;


import java.util.*;

public class Main {
    static int n, max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int m = kb.nextInt();
            int d = kb.nextInt();
            arr.add(new Lecture(m, d));
            if (d > max) max = d;
        }
        System.out.println(T.solution(arr));
    }

    public int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder()); // 큰값을 우선순위로
        Collections.sort(arr); // 날짜에 의해서 내림차순 정렬
        int j = 0;
        for (int i = max; i >= 1; i--) { // max 가 가장 큰 날짜
            for (; j < n; j++) {
                if (arr.get(j).date < i) break;
                pQ.offer(arr.get(j).money);
            }
            if (!pQ.isEmpty()) answer += pQ.poll();
        }

        return answer;
    }


}

class Lecture implements Comparable<Lecture> {
    public int money;
    public int date;

    public Lecture(int money, int date) {
        this.money = money;
        this.date = date;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.date - this.date; // 내림차순
    }
}

