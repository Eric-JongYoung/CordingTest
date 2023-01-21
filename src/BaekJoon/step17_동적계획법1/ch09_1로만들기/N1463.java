package BaekJoon.step17_동적계획법1.ch09_1로만들기;

import java.util.Arrays;
import java.util.Scanner;


public class N1463 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] dy = new int[n + 1];
        Arrays.fill(dy, Integer.MAX_VALUE); // dy 값을 모두 큰 숫자로 초기화
        dy[0] = 0;
        dy[1] = 0;
        for(int i = 2; i <= n ;i++){
            dy[i] = dy[i-1] + 1;
            if(i%3==0) dy[i] = Math.min(dy[i], dy[i / 3] + 1);
            if(i%2==0) dy[i] = Math.min(dy[i], dy[i / 2] + 1);
        }
        System.out.println(dy[n]);
    }
}