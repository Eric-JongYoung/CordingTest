package inflearn.Step08_DFS_BFS_활용.ch04_중복순열구하기;

import java.util.Scanner;

public class Main {
    static int[] pm;
    static int n, m;


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];
        T.DFS(0);
    }

    public void DFS(int L) {
        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();

        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L+1);
            }
        }
    }
}
/**
 * 중복순열 -> 2가닥이 아니라 여러 가닥으로 뽑아나감
 *
 *
 1부터 N까지 번호가 적힌 구슬이 있습니다. 이 중 중복을 허락하여 M번을 뽑아 일렬로 나열 하는 방법을 모두 출력합니다.
 ▣ 입력설명
 첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N) 이 주어집니다.
 ▣ 출력설명
 첫 번째 줄에 결과를 출력합니다.
 출력순서는 사전순으로 오름차순으로 출력합니다.
 ▣ 입력예제 1
 32
 ▣ 출력예제 1
 11
 12
 13
 21 22 23 31 32 33


 * */
