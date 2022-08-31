package class3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _7576_토마토 {
	//좌표를 넣어줄 클래스를 만든다.
	static class Pos{
		int r, c;
		public Pos(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}
	
	static int[][] box; //박스배열
	static int N, M; // N - 세로, M - 가로 입력은 M부터 들어온다(주의)
	static int[] dr = { -1, 1, 0, 0 }; //사방탐색
	static int[] dc = { 0, 0, -1, 1 }; 
	static int ans;
	static int r, c;
	static Queue<Pos> queue;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		
		box = new int[N][M];

		queue = new LinkedList<Pos>();
		
		for(int i = 0; i < N; i++) {
			for(int j =0; j < M; j++) {
				box[i][j] = sc.nextInt();
				//입력을 받으면서 1이면 바로 큐에 넣어준다(시작지점)
				if(box[i][j] == 1) {
					queue.add(new Pos(i,j));
				}
			}
		}
		
		System.out.println(bfs());
	}
	private static int bfs() {
		
		while(!queue.isEmpty()) {
			Pos p = queue.poll();

			for(int d = 0; d < 4; d++) {
				int nr = p.r + dr[d];
				int nc = p.c + dc[d];
				
				if(nr >= 0 && nc >= 0 && nr < N && nc < M ) {
					if(box[nr][nc] == 0) {
						queue.add(new Pos(nr, nc));
						box[nr][nc] = box[p.r][p.c] +  1;
					}
				}
			}
		}
		ans = Integer.MIN_VALUE;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(box[i][j] == 0)
					return -1;
				ans = Math.max(ans, box[i][j]);
			}
		}
		if(ans == 1) {
			return 0;
		}
		return ans -1;
	}
}
