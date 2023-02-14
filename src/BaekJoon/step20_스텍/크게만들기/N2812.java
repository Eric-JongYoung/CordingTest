package BaekJoon.step20_스텍.크게만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class N2812 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int cnt = 0;
        Stack<Integer> stack = new Stack<>();
        String str = br.readLine();
        for (int i = 0; i < N; i++) {
            int tmp = str.charAt(i) - '0';
            while (cnt < K && !stack.isEmpty() && stack.peek() < tmp) {
                stack.pop();
                cnt++;
            }
            stack.push(tmp);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N - K; i++) {
            sb.append(stack.get(i));
        }
        System.out.println(sb);
        br.close();
    }
}
