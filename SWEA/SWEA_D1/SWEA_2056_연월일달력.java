package SWEA_API_D1;

import java.util.Scanner;

public class SWEA_2056_연월일달력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String date = sc.next();
			String year = date.substring(0, 4);
			String month = date.substring(4, 6);
			String day = date.substring(6, 8);

			int y = Integer.parseInt(year);
			int m = Integer.parseInt(month);
			int d = Integer.parseInt(day);

			if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d >= 1 && d <= 31)) {
				System.out.println("#" + tc + " " + year + "/" + month + "/" + day);
			} // endif 31일달
			else if ((m == 4 || m == 6 || m == 9 || m == 11) && (d >= 1 && d <= 30)) {
				System.out.println("#" + tc + " " + year + "/" + month + "/" + day);
			} // end elseif 30일달
			else if ((m == 2) && (d >= 1 && d <= 28)) {
				System.out.println("#" + tc + " " + year + "/" + month + "/" + day);
			} // end elseif 2월달

			else
				System.out.println("#" + tc + " " + -1);
		} // end for
	}
}
