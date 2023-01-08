package inflearn.step07.ch04_피보나치수열;

public class MainWithArray {
    static int[] fibo;

    public static void main(String[] args) {
        MainWithArray T = new MainWithArray();
        int n = 45;
        fibo = new int[n + 1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    public int DFS(int n) {
        if (n == 1) return fibo[n]=1;
        else if (n == 2) return fibo[n]=1;
        else return fibo[n] = DFS(n - 2) + DFS(n - 1);
    }
}
