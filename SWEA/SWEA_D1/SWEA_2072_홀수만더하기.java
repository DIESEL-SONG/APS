package SWEA_API_D1;

import java.util.Scanner;

public class SWEA_2072_홀수만더하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int sum = 0;
			for(int i = 0; i < 10; i++) {
				int n = sc.nextInt();
				if (n%2 == 1)
					sum += n;
			}
			System.out.print("#" + tc + " " + sum);
			System.out.println();
		}
	}

}
