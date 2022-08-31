package D3;

import java.util.Scanner;

public class _12004_구구단1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			boolean check = true;
			loop: for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					if (i * j == N) {
						check = true;
						break loop;
					} else
						check = false;
				}
			}
			if (check)
				System.out.println("#" + tc + " " + "Yes");
			else
				System.out.println("#" + tc + " " + "No");

		}
	}
}
