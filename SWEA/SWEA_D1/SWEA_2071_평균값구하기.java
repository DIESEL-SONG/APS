package SWEA_API_D1;

import java.util.Scanner;

public class SWEA_2071_평균값구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int sum = 0;
			int avg = 0;
			for(int i = 0; i < 10; i++) {
				int n = sc.nextInt();
				sum += n;
				avg = (int)Math.round((double)sum/10);
			}
			System.out.print("#" + tc + " " + avg);
			System.out.println();
			
		}
	}
}
