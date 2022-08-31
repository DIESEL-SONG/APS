package class3;

import java.util.Scanner;

public class _11724_연결요소의개수 {
	static int[][] adjArr = new int[1001][1001];
	static int V;
	static int E;
	static boolean[] visited = new boolean[1001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		V = sc.nextInt();
		E = sc.nextInt();
		
		for(int i =0; i < E; i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			
			adjArr[st][ed] = 1;
			adjArr[ed][st] = 1;
		}
		
		int result = 0;
		
		for(int i = 1; i <= V; i++) {
			if(visited[i] == false) {
				dfs(i);
				result++;
			}
		}
		
		System.out.println(result);
	}
	
	public static void dfs(int idx) {
		if(visited[idx] == true)
			return;
		else {
			visited[idx] = true;
			for(int i = 1; i <= V; i++) {
				if(adjArr[idx][i] == 1) {
					dfs(i);
				}
			}
		}
	}
}
