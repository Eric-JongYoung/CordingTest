package BaekJoon.step17_동적계획법1.부녀회장이될테야;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2775 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        int[][] APT = new int[15][15];
        for (int i = 0; i < 15; i++) {
            APT[i][1] = 1; // i층 1호
            APT[0][i] = i; // 0층 i호
        }
        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
            }
        }

        for (int i = 0; i < tc; i++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            System.out.println(APT[K][N]);
        }

        br.close();
    }

}