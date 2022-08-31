package SWEA_D2;

import java.util.Scanner;

public class F_1940_가랏RC카 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int move = 0;
			int speed = 0;

			for (int i = 0; i < N; i++) {
				int command = sc.nextInt();

				if (command == 1) {
					int s = sc.nextInt();
					speed += s;
				} else if (command == 2) {
					int s = sc.nextInt();
					speed -= s;
				}

				if (speed < 0)
					speed = 0;

				move += speed;
			}

			System.out.println("#" + tc + " " + move);
		}
	}
}
