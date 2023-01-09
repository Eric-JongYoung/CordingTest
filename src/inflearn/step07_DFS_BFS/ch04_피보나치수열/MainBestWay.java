package inflearn.step07_DFS_BFS.ch04_피보나치수열;

public class MainBestWay {
    static int[] fibo;

    public static void main(String[] args) {
        MainBestWay T = new MainBestWay();
        int n = 45;
        fibo = new int[n + 1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    public int DFS(int n) {
        if(fibo[n]>0) return fibo[n];  // 기존의 값을 저장해서 더 빠르게 호출함.
        if (n == 1) return fibo[n]=1;
        else if (n == 2) return fibo[n]=1;
        else return fibo[n] = DFS(n - 2) + DFS(n - 1);
    }
}
