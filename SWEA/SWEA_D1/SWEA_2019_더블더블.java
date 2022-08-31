package SWEA_API_D1;

import java.util.Scanner;

public class SWEA_2019_더블더블 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 1;
		System.out.print(a + " ");
		for(int i = 1; i <=n; i++) {
			a = a*2;
		System.out.print(a + " ");
		}
	}
}
