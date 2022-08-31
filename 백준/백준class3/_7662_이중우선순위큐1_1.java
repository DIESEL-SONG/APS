package class3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _7662_이중우선순위큐1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 0; tc < T; tc++) {
			int K = sc.nextInt();

			PriorityQueue<Integer> pq1 = new PriorityQueue<>();// 오름차순이니까 최소힙
			PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

			for (int i = 0; i < K; i++) {
				String c = sc.next();
				int num = sc.nextInt();

				switch (c) {
				case "I":
					pq1.add(num);
					pq2.add(num);
					break;
				case "D":					
					if (pq1.isEmpty())
						continue;
					if (pq2.isEmpty())
						continue;
					if (num == -1) {
						pq1.poll();
					} else {
						pq2.poll();
					}
				}
			}

			int[] pq1remain = new int[pq1.size()];
			int[] pq2remain = new int[pq2.size()];

			while (!pq1.isEmpty()) {
				int idx = 0;
				pq1remain[idx] = pq1.poll();
				idx++;
			}
			
			while (!pq2.isEmpty()) {
				int idx = 0;
				pq2remain[idx] = pq2.poll();
				idx++;
			}
			
			Arrays.sort(pq1remain);
			Arrays.sort(pq2remain);
			
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < pq1remain.length; i++) {
				for(int j = 0; j < pq2remain.length; i++) {
					if(pq1remain[i] == pq2remain[j]) {
						list.add(pq1remain[i]);
					}
						
				}
			}
			
			Collections.sort(list);
			
			if(list.isEmpty())
				System.out.println("EMPTY");
			else {
				System.out.println(list.get(list.size()-1) + " " + list.get(0));				
			}
		}
	}
}
