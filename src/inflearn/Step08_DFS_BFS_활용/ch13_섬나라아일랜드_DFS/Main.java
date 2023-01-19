package inflearn.Step08_DFS_BFS_활용.ch13_섬나라아일랜드_DFS;


import java.util.Scanner;


class Main {
	//8방향
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int answer=0, n;

    public void DFS(int x , int y, int[][] board) {
		for (int i = 0; i < 8; i++) { // 8방향으로 돌으니까
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
				board[nx][ny] = 0;
				DFS(nx, ny, board);
			}
		}
    }

	public void solution(int[][] board) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1) { //섬을 만났을 때
					answer++;
					board[i][j]=0; // 출발점은 0으로 바궈놓음
					DFS(i, j , board);
				}
			}
		}
	}

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
		T.solution(arr);
        System.out.println(answer);
    }
}
/**
 * 2중 for 문을 돌면서 섬을 탐색하고
 * 섬을 만나면 answer +1 하고나서, BFS 를 발동해서 해당 섬을 지우고 다시 탐색 가도록
 */