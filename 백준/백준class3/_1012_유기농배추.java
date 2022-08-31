package class3;

import java.util.Scanner;

public class _1012_유기농배추 {
	static int R;
	static int C;
	static int L;

	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	
	static int[][] field;
	static boolean[][] visit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int k = 0; k < n; k++) {

			R = sc.nextInt();
			C = sc.nextInt();
			L = sc.nextInt();

			field = new int[R][C];
			visit = new boolean[R][C];
			
			for (int i = 0; i < L; i++) {
				field[sc.nextInt()][sc.nextInt()] = 1;
			}

			int cnt = 0;
			
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					if (field[i][j] == 1 && !visit[i][j]) {
						dfs(i, j);
						cnt++;
					}
				}
			}

			System.out.println(cnt);
		}
	}

	private static void dfs(int x, int y) {
		visit[x][y] = true;
		
		for(int k = 0; k < 4; k++) {
			int nr = x+ dr[k];
			int nc = y + dc[k];
			
			if(nr>=0 && nr < R && nc>=0 && nc < C) {
				if(field[nr][nc] == 1 && !visit[nr][nc]) {
					dfs(nr, nc);
				}
			}
		}
		
	}
}
