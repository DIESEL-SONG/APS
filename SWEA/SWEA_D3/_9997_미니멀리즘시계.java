package D3;

import java.util.Scanner;

public class _9997_미니멀리즘시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int b = sc.nextInt();

			// 1도에 2분, 각도 * 2하면 몇분이 지났는지 알 수있음.
			b = b * 2;
			int h = b / 60;
			int m = b % 60;

			System.out.println("#" + tc + " " + h + " " + m);
		} // end for tc
	}
}
