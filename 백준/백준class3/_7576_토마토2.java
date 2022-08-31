package class3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _7576_토마토2 {
	static class Pos{
		int r, c;
		public Pos(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}
	static int[][] box; // 박스배열
	static int N, M; //N -세로 M - 가로 입력은 M부터 주어진다.
	static int r, c; 
	static int ans; 
	static Queue<Pos> queue;
	static int[] dr = {-1, 1, 0, 0};//사방탐색
	static int[] dc = {0, 0, -1, 1};//상하좌우
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		M = sc.nextInt();
		N = sc.nextInt();
		
		box = new int[N][M];
		queue = new LinkedList<Pos>();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				box[i][j] = sc.nextInt();
				if(box[i][j] ==1) {
					queue.add(new Pos(i, j));
				}
			}
		}
		
		System.out.println(bfs());
	}

	private static int bfs() {
		while(!queue.isEmpty()) {
			Pos p = queue.poll();
			
			for(int d = 0; d <4; d++) {
				int nr = p.r + dr[d];
				int nc = p.c + dc[d];
				
				if(nr >= 0 && nc >= 0 && nr < N && nc <M) {
					if(box[nr][nc] == 0) {
						queue.add(new Pos(nr, nc));
						box[nr][nc] = box[p.r][p.c] + 1;
					}
				}//end if
			}//end for 사방탐색
		}//end while 
		
		ans = Integer.MIN_VALUE;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				//끝까지 돌렸는데도 0인게있으면(안익은게 있으면) -1을 출력
				if(box[i][j] == 0)
					return -1;
				//가장 큰 값으로 갱신해주기
				ans = Math.max(ans, box[i][j]);
			}
		}
		//처음부터 토마토가 다 익어서 더 익을게 없는상태라면, 0일
		if(ans == 1)
			return 0;
		//1부터 시작했으므로 최종 값에서 1을 빼주기.
		else
			return ans -1;
	}
}
