package BaekJoon.step14_기하1.ch02_네번째점;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arrX = new int[3];
        int[] arrY = new int[3];
        int ansX, ansY;


        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrX[i] = Integer.parseInt(st.nextToken());
            arrY[i] = Integer.parseInt(st.nextToken());
        }
        if (arrX[1] == arrX[2]) {
            ansX = arrX[0];
        }else {
            ansX = (arrX[0] == arrX[1]) ? arrX[2] : arrX[1];
        }

        if (arrY[1] == arrY[2]) {
            ansY = arrY[0];
        }else {
            ansY = (arrY[0] == arrY[1]) ? arrY[2] : arrY[1];
        }

        System.out.println(ansX+ " "+ansY);

        br.close();
    }
}
