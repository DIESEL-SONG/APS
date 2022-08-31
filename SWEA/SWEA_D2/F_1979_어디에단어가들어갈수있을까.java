package SWEA_D2;

import java.util.Scanner;

public class F_1979_어디에단어가들어갈수있을까 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			int ans = 0;

			int[][] map = new int[N + 2][N + 2];
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < N + 2; i++) {
				int cnt = 0;
				for (int j = 0; j < N + 1; j++) {

					if (map[i][j] == 0) {
						if (map[i][j + 1] != map[i][j])
							cnt++;
					} else {
						if (map[i][j + 1] == map[i][j])
							cnt++;
						else {
							if (cnt == K) {
								ans++;
							}
							cnt = 0;
						}
					}
//					if (cnt == K)
//						ans++;
				}
			}
			

			for (int i = 0; i < N + 2; i++) {
				int cnt = 0;
				for (int j = 0; j < N + 1; j++) {

					if (map[j][i] == 0) {
						if (map[j + 1][i] != map[j][i])
							cnt++;
					} else {
						if (map[j+1][i] == map[j][i])
							cnt++;
						else {
							if (cnt == K) {
								ans++;
							}
							cnt = 0;
						}
					}
//					if (cnt == K)
//						ans++;
				}
			}
			System.out.println("#" + tc + " " + ans);
			
		} // end for tc
	}
}
