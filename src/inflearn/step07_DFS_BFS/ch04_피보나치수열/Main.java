package inflearn.step07_DFS_BFS.ch04_피보나치수열;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        int n = 5;
        for(int i = 1; i <= n ; i ++) {
            System.out.print(T.DFS(i)+ " ");
        }
    }

    public int DFS(int n) {
        if(n==1) return 1;
        else if(n==2) return 1;
        else return DFS(n-2) + DFS(n-1);
    }
}

/**
 * 재귀 함수를 통해서 이미 구해진걸 반복적으로 구하면 -> 메모리 낭비 및 느려짐
 * 이를 해결하기 위해서,
 *
 * */