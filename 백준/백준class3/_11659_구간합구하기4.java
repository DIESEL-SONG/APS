package class3;

import java.util.Scanner;

//헉 시간초과...
public class _11659_구간합구하기4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] num = new int[N];

		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}

		for (int j = 0; j < M; j++) {
			int st = sc.nextInt() - 1;
			int ed = sc.nextInt() - 1;

			int sum = 0;
			for (int i = st; i <= ed; i++) {
				sum += num[i];
			}

			System.out.println(sum);
		}
	}
}
