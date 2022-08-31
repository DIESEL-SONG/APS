package class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1966_프린터큐 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();// 문서의 개수
			int M = sc.nextInt();// 몇번째로 인쇄되는지 궁금한 문서의 큐의 순서

			Queue<int[]> queue = new LinkedList<>();
			for (int j = 0; j < N; j++) {
				queue.offer(new int[] { j, sc.nextInt() });
			}

			int cnt = 0;

			while (!queue.isEmpty()) {
				int[] front = queue.poll();
				boolean isMax = true;

				for (int[] q : queue) {
					if (q[1] > front[1])
						isMax = false;
				}

				if (isMax) {
					cnt++;
					if (front[0] == M)
						break;
				}
				else
					queue.add(front);

			}


			System.out.println(cnt);

		}
	}
}
