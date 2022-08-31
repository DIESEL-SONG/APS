package SWEA_D2;

import java.util.Scanner;

public class T_1989_초심자의회문검사 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트케이스의 갯수
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			char[] c = str.toCharArray();
			for (int i = 0; i < str.length(); i++) {
				c[i] = str.charAt(i);
			}
			int a = 0;
			int b = str.length() - 1;
			int ans = 1;
			if (b % 2 == 1) {
				while (a < b - 1) {
					if (c[a] == c[b]) {
						a++;
						b--;
					} else if (c[a] != c[b]) {
						ans = 0;
						break;						
					}
				}
			} else if (b % 2 == 0) {
				while (a < b) {
					if (c[a] == c[b]) {
						a++;
						b--;
					} else if (c[a] != c[b]) {
						ans = 0;
						break;
					}
				}
			}
			
			System.out.println("#" + tc + " " + ans);
		} // end for tc
	}
}
