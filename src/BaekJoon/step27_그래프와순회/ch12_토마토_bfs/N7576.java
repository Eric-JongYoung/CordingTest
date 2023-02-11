package BaekJoon.step27_그래프와순회.ch12_토마토_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Point{
	public int x, y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}
class N7576 {
	static int[] dx={-1, 0, 1, 0};
	static int[] dy={0, 1, 0, -1};
	static int[][] board, dis;
	static int n, m;
	static Queue<Point> Q=new LinkedList<>(); // 전역으로 잡은 이유는 BFS 도 사용해야하지만, main 에서도 익은 토마토를 넣어야하기때문
	public static void bfs(){
		while(!Q.isEmpty()){
			Point tmp=Q.poll();
			for(int i=0; i<4; i++){
				int nx=tmp.x+dx[i];
				int ny=tmp.y+dy[i];
				if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==0){
					board[nx][ny]=1;
					Q.offer(new Point(nx, ny));
					dis[nx][ny]=dis[tmp.x][tmp.y]+1;
				}
			}
		}	
	}

	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		m=kb.nextInt();
		n=kb.nextInt();
		board=new int[n][m];
		dis=new int[n][m];
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				board[i][j]=kb.nextInt();
				if(board[i][j]==1) Q.offer(new Point(i, j)); // 익은 토마토 넣어놓기 - 0 레벨
			}
		}
		bfs();

		boolean flag=true; // 익지 않은 토마토 검색용
		int answer=Integer.MIN_VALUE;
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(board[i][j]==0) flag=false;
			}
		}
		if(flag){
			for(int i=0; i<n; i++){
				for(int j=0; j<m; j++){
					answer=Math.max(answer, dis[i][j]);
				}
			}
			System.out.println(answer);
		}
		else System.out.println(-1);
	}
}