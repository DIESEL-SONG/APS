package D3;

import java.util.Scanner;

public class _10505_소득불균형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();

			int[] income = new int[N];
			int sum = 0;
			int avg = 0;
			for (int i = 0; i < N; i++) {
				income[i] = sc.nextInt();
				sum += income[i];
			}
			
			avg = sum / N;
			int cnt = 0;
			for(int i = 0; i < N; i++) {
				if(income[i] <= avg) {
					cnt++;
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}//tc
	}
}
