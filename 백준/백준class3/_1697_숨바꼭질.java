package class3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1697_숨바꼭질 {
	static int N;
	static int K;
	
	//최대값이 100000만이므로 한칸더 크게 visited배열 생성해줌.
	static int visited[] = new int[100001];
	
	public static void main(String[] args) {
		//수빈이의 위치 : X
		//걸어간다면 1초후에 수빈이의 위치 : X+1, X-1 
		//순간이동시 1초후에 수빈이의 위치 : 2*X
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		K = sc.nextInt();
		
		int ans = bfs(N);
		System.out.println(ans);
		
	}

	private static int bfs(int idx) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(idx);
		int i = idx;
		int n = 0;
		visited[i] = 1;
		while(!queue.isEmpty()) {
			n = queue.remove();
			
			if(n == K)
				return visited[n]-1;
			if(n-1 >= 0 && visited[n-1] == 0) {
				visited[n-1] = visited[n] + 1;
				queue.add(n-1);
			}
			if(n+1 <= 100000 && visited[n+1] == 0) {
				visited[n+1] = visited[n]+1;
				queue.add(n+1);
			}
			if(2*n <= 100000 && visited[2*n] == 0) {
				visited[2*n] = visited[n] +1;
				queue.add(2*n);
			}
		}
		return 0;
	}
}
