//서로소 찾는 문제인줄알고, 서로소찾는거로 처음에 풀었는데
//테케는 통과했는데 12퍼에서 틀렸습니다로 나와서..
//구선생님한테 물어보니 그래프를 관계를 배열로 만든 후, dfs나 bfs로 탐색해야한다고 해서
//다시 풀었습니다.
package class3;

import java.util.Queue;
import java.util.Scanner;

public class _2606_바이러스2 {
	static int[][] p;
	static boolean[] visited;
	static int cnt;
	static int N, M;
	static Queue<Integer> queue;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		p = new int[N + 1][N + 1];
		visited = new boolean[N+1];
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			p[a][b] = 1;
			p[b][a] = 1;
		}
		
		dfs(1);
		System.out.println(cnt-1);
	}
	private static void dfs(int i) {
		visited[i] = true;
		cnt++;
		
		for(int j = 1; j < N+1; j++) {
			if(p[i][j] == 1 && !visited[j]) {
				dfs(j);
			}
		}	
	}
}
