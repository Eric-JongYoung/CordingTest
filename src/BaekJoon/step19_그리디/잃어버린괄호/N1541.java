package BaekJoon.step19_그리디.잃어버린괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        while (st.hasMoreTokens()) {
            int tmp = 0;
            StringTokenizer plus = new StringTokenizer(st.nextToken(), "+");
            while (plus.hasMoreTokens()) {
                tmp += Integer.parseInt(plus.nextToken());
            }
            if (sum == Integer.MAX_VALUE) {
                sum = tmp;
            } else {
                sum -= tmp;
            }
        }
        System.out.println(sum);
        br.close();
    }
}
