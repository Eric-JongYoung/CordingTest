package inflearn.step08_DFS_BFS_활용.ch01_합이같은부분집합;

import java.util.Scanner;

public class Main {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }

    private void DFS(int L, int sum, int[] arr) {
        if(flag) return;
        if(sum>total/2) return; // sum 값이 넘어가버리면 필요가 없으므로 리턴
        if(L==n) {
            if ((total - sum) == sum) { // total 에서 sum 을 뺐을때, 그 값이 sum 이면 해당 값이 절반 값이므로 맞는 집합이다.
                answer = "YES";
                flag = true;
            }
        }else {
            DFS(L + 1, sum + arr[L], arr); // 왼쪽으로 뻣기 ( 부분집합에 포함하기)
            DFS(L + 1, sum, arr); // 오른쪽을 뻣기 ( 부분집합에 미포함)
        }
    }
}
