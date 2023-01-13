package inflearn.step06_Sort_and_Searching.ch07_좌표정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr); // 얘가 밑에 있는 compareTo 로 정렬
        for (Point o : arr) {
            System.out.println(o.x + " " + o.y);
        }
    }


}

class Point implements Comparable<Point>{
    public int x , y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x==o.x) return this.y - o.y; // 오름차순으로 하려면 음수가 리턴되어야함.
        else return this.x - o.x; // 오름차순으로 하려고 음수가 리턴되어야함.

        // 만약 내림차순으로 하고 싶으면 반대로 빼주면 됨.
    }
}