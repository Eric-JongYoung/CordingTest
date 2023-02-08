package BaekJoon.step19_그리디.거스름돈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N5585 {
    static int[] dy;
    static int change;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int paid = Integer.parseInt(br.readLine());
        change = 1000 - paid;
        int[] arr = {1, 5, 10 , 50, 100, 500};
        dy = new int[change + 1];
        System.out.println(solution(arr));

        br.close();
    }

    public static int solution(int[] coin) {
        Arrays.fill(dy, Integer.MAX_VALUE); // dy 값을 모두 큰 숫자로 초기화
        dy[0] = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = coin[i]; j <= change; j++) {
                dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
            }
        }
        return dy[change];
    }
}

