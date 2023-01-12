package inflearn.step06_Sort_and_Searching.ch04_LRU_캐시_카카오번형;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(size, n, arr)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size];
        for (int x : arr) {
            int pos = -1; //index 번호
            for (int i = 0; i < size; i++) if(x==cache[i]) pos = i; //히트 일때
            if(pos==-1){ // 미스 상황
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }else { // 히트 일때
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }
        return cache;

    }

}
