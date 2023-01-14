package RealCordingTest.Zum.Q2;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int[][] data = {{1,0,5},{2,2,2},{3,3,1},{4,4,1},{5,10,2}};
        int[][] data = {{1,0,3},{2,1,3},{3,3,2},{4,9,1},{5,10,2}};

//        System.out.println(data[0][0]+","+data[0][1]);

        for(int x: T.solution(data)){
            System.out.print(x +",");
        }

    }

    public int[] solution(int[][] data) {
        int[] answer = new int[data.length];
        int n = data.length;
        Queue<Print> Q = new LinkedList<>();
        // Print 객체로 넣기.
        for (int i = 0; i < n; i++) {
            Q.offer(new Print(data[i][0],data[i][1],data[i][2]));
        }
        int cnt = 1;
        Print p = Q.poll();
        answer[0] = p.id;
        int time = p.pages;
        System.out.println(time);
        while (!Q.isEmpty()) {
            Print tmp = Q.poll();
            for (Print x : Q) {
                if(time!=tmp.time &&((tmp.pages == x.pages && tmp.time > x.time) || (tmp.pages > x.pages))) {
                        Q.offer(tmp);
                        tmp = null;
                        break;
                }
            }
            if (tmp != null) {
                answer[cnt] = tmp.id;
                cnt++;
                time=tmp.pages;
            }
        }
        return answer;
    }
}

class Print{
    int id;
    int time;
    int pages;

    public Print(int id, int time, int pages) {
        this.id = id;
        this.time = time;
        this.pages = pages;
    }

}
