package D3;

import java.util.Scanner;

public class _5162_두가지빵의딜레마 {
	static int cntA, cntB, cnt = 0;
	static int A, B, C;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			A = sc.nextInt(); // 현미빵가격
			B = sc.nextInt(); // 단호박빵가격
			C = sc.nextInt(); // 은비가 가진 돈

			find(A, B, C);

			System.out.println("#" + tc + " " + cnt);
		}

	}

	private static void find(int a, int b, int c) {
		// 첫번째 A빵 채우고 남은거 B사기
		// 두번째 B빵 채우고 남은거 B사기
		int maxA = 0;
		int maxB = 0;
		if (A < B) {
			cntA = C / A;
			cntB = (C % A) / B;
			maxA = cntA + cntB;
		}
		if (B < A) {
			cntB = C / B;
			cntA = (C % B) / A;
			maxB = cntA + cntB;
		}
		cnt = Math.max(maxA, maxB);
		
		return;
	}
}
