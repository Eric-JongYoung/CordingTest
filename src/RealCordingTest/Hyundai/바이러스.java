package RealCordingTest.Hyundai;

import java.io.*;
import java.util.StringTokenizer;

public class 바이러스 {
    static int n, p, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        long answer = k;
        for (int i = 1; i <= n; i++) {
            answer = (answer * p) % 1000000007;
        }
        System.out.println(answer);
        br.close();
    }
}

