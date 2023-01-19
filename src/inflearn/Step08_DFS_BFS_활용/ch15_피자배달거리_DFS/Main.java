package inflearn.Step08_DFS_BFS_활용.ch15_피자배달거리_DFS;


import java.util.ArrayList;
import java.util.Scanner;


class Main {
	static ArrayList<Point> hs, pz;
	static int n, m , len, answer = Integer.MAX_VALUE;
	static int[] combi;

    public void DFS(int L, int s) {
		if (L == m) {
			int sum = 0 ; // 도시의 피자 배달거리
			for (Point h : hs) { //집 선택
				int dis = Integer.MAX_VALUE;
				for (int i : combi) { // 조합의 인덱스 번호
					dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
				}
				sum+=dis;
			}
			answer = Math.min(answer, sum);
		}
		else {
			for (int i = s; i < len; i++) { // 부분집합 만들기
				combi[L] = i;
				DFS(L + 1, i + 1);
			}
		}
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt(); // 살려야하는 피자집 개수

		pz = new ArrayList<>();
		hs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
				int tmp = kb.nextInt();
				if(tmp==1) hs.add(new Point(i, j));
				else if(tmp==2) pz.add(new Point(i,j));
            }
        }
		len = pz.size();
		combi = new int[m];
		T.DFS(0,0);
		System.out.println(answer);
    }
}
class Point{
	int x,y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
