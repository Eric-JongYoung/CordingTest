package inflearn.step07_DFS_BFS.ch03_팩토리얼;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        System.out.println(T.DFS(5));
    }

    public int DFS(int n) {
        if(n==0) return 1;
        else return n * DFS(n - 1);
    }
}
