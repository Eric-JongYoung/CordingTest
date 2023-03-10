package inflearn.step07_DFS_BFS.ch06_부분집합구하기_DFS;

public class Main {
    static int n; // 집합 원소의 개수
    static int[] ch; // 체크 배열

    public void DFS(int L) { // L이라는 원소를 사용한다 vs 사용하지 않는다.

        if (L == n + 1) { // 종착점에 도착 했을때. -> ch에 체크된 것들만 출력하도록 설정
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if(ch[i]==1) tmp += (i + " ");
            }
            if(tmp.length()>0) System.out.println(tmp); // 공집합이 아닐때만 출력하라.

        }else { // 두 갈래로 뻣어나가는 과정
            ch[L] = 1; // 배열에 사용한다.
            DFS(L + 1); //왼쪽으로 가지 뻣기

            ch[L] = 0; // 배열에 사용 안한다.
            DFS(L + 1); // 오른쪽으로 가지 뻣기
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        n = 3;
        ch = new int[n + 1];
        T.DFS(1);
    }
}
