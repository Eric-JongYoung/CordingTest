package BaekJoon.step21_큐_덱.요세푸스문제;



import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            Q.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (Q.size() > 0) {
            for (int i = 1; i < K; i++) {
                Q.offer(Q.poll());
            }
            sb.append(Q.poll());
            if (Q.size() > 0) {
                sb.append(", ");
            }
        }
        sb.append(">");
        bw.write(sb.toString());
        bw.flush();
        br.close();
    }
}
