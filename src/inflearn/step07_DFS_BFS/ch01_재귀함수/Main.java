package inflearn.step07_DFS_BFS.ch01_재귀함수;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(3);
    }

    /***
     * return 은 method 끝날때도 사용함
     * 재귀함수는 stack 을 사용 함 그래서 1,2,3 으로 나오는거임
     *
     * 왜 밑에다 두면 1,2,3 으로 출력 될까?
     */
    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n - 1);
            System.out.print(n+ " ");
        }
    }
}
/**
 * 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력하는 프로그램을 작성
 *
 * */
