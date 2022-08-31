package D3;

import java.util.Scanner;

public class _4406_모음이보이지않는사람 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < str.length(); i++) {
				char tmp = str.charAt(i);
				if(tmp != 'a' && tmp != 'e' && tmp != 'i' && tmp != 'o' && tmp != 'u')
					sb.append(tmp);
			}
			
			System.out.println("#" + tc + " " + sb.toString());
		}//end for tc
	}//main
}
