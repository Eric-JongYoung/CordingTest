package BaekJoon.step17_동적계획법1.ch16_평범한배낭;

import java.util.Scanner;

public class N12865 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] dy = new int[k + 1];
        for (int i = 0; i < n; i++) {
            int w = kb.nextInt();
            int v = kb.nextInt();
            for (int j = k; j >= w; j--) {
                dy[j] = Math.max(dy[j], dy[j - w] + v);
            }
        }
        System.out.println(dy[k]);
    }
}