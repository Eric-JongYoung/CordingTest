package BaekJoon.step10_정렬.ch09_좌표정렬하기2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class N11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Point> arr = new ArrayList<>();
        StringTokenizer st ;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr.add(new Point(x, y));
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(arr); // 얘가 밑에 있는 compareTo 로 정렬
        for (Point o : arr) {
            sb.append(o.x + " " + o.y );
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();

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
        if(this.y==o.y) return this.x - o.x; // 오름차순으로 하려면 음수가 리턴되어야함.
        else return this.y - o.y; // 오름차순으로 하려고 음수가 리턴되어야함.

        // 만약 내림차순으로 하고 싶으면 반대로 빼주면 됨.
    }
}