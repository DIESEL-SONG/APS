package D3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _8673_코딩토너먼트1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();

			N = (int) Math.pow(2, N);
			int ans = 0;
			
			Queue<Integer> queue = new LinkedList<>();

			for (int i = 0; i < N; i++) {
				queue.add(sc.nextInt());
			}

			
			while (queue.size() >1) {
				int a = queue.poll();
				int b = queue.poll();
				
				queue.add(Math.max(a, b));
				ans += Math.abs(a -b);
			}

			System.out.println("#" + tc + " " + ans);
		} // end for tc
	}
}
