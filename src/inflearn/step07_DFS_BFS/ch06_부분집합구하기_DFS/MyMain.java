package inflearn.step07_DFS_BFS.ch06_부분집합구하기_DFS;

public class MyMain {
    static int n; // 집합 원소의 개수
    static int[] ch; // 체크 배열

    public void DFS(int L) { // L이라는 원소를 사용한다 vs 사용하지 않는다.
        if (L == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if(ch[i]==1) tmp+= i+" ";
            }
            if(tmp.length()>0) System.out.println(tmp);
        }else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }

    }

    public static void main(String[] args) {
        MyMain T = new MyMain();
        n = 3;
        ch = new int[n + 1];
        T.DFS(1);
    }
}
