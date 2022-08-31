package _1트;

import java.util.Scanner;

public class _6064_카잉달력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 0; tc < T; tc++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int year = 1;
			while(true) {
				if((year-x) % M == 0 && (year - y) % N	== 0)
					break;
				year++;
			}
			
			System.out.println(year);
		}
	}
}
