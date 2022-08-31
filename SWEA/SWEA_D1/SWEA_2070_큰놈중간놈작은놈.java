package SWEA_API_D1;

import java.util.Scanner;

public class SWEA_2070_큰놈중간놈작은놈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if( a > b)
				System.out.print("#" + tc + " " + ">\n");
			else if( a == b)
				System.out.print("#" + tc + " " + "=\n");
			else if( a < b)
				System.out.print("#" + tc + " " + "<\n");
		}
		
		
	}
}

