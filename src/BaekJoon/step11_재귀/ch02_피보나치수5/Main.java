package BaekJoon.step11_재귀.ch02_피보나치수5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(n)));

        bw.flush();
        bw.close();
        br.close();
    }

    public static int solution(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return solution(n - 1) + solution(n - 2);
    }
}
