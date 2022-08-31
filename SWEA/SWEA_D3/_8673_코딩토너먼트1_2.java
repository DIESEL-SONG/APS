package D3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _8673_코딩토너먼트1_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());

			N = (int) Math.pow(2, N);
			int ans = 0;
			
			Queue<Integer> queue = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < N; i++) {
				queue.add(Integer.parseInt(st.nextToken()));
			}

			while (queue.size() >1) {
				int a = queue.poll();
				int b = queue.poll();
				
				queue.add(Math.max(a, b));
				ans += Math.abs(a -b);
			}

			System.out.println("#" + tc + " "+ ans);
		} // end for tc
	}
}
