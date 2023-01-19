package inflearn.step08_DFS_BFS_활용.ch10_미로탐색_DFS;

import java.util.*;
class Main {
	static int[] dx={-1, 0, 1, 0};
	static int[] dy={0, 1, 0, -1};
	static int[][] board;
	static int answer=0;

	public void DFS(int x, int y){
		if(x==7 && y==7) answer++;
		else {
			for(int i = 0 ; i < 4 ; i++){
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0){
					// 경계선 안쪽인지 체크 , board 값이 0 이여야 지나갈 수 있음
					board[nx][ny] = 1; //지나갔으니 체크
					DFS(nx, ny); //지나감
					board[nx][ny] = 0 ; // 돌아왔으니 체크 해제
				}
			}
		}
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		board=new int[8][8];
		for(int i=1; i<=7; i++){
			for(int j=1; j<=7; j++){
				board[i][j]=kb.nextInt();
			}
		}
		board[1][1]=1;
		T.DFS(1, 1);
		System.out.print(answer);
	}
}