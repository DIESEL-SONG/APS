package SWEA_D2;

import java.util.Scanner;

public class F_1948_날짜계산기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int M1 = sc.nextInt()-1;
			int D1 = sc.nextInt();
			int M2 = sc.nextInt()-1;
			int D2 = sc.nextInt();
			
			int ans = 0;
			int[] Month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			int sum1 = 0;
			int sum2 = 0;
			for(int i = 0; i < M1; i ++) {
				sum1 += Month[i];
			}
			sum1 = sum1+D1;
			
			for(int i = 0; i < M2; i ++) {
				sum2 += Month[i];
			}
			sum2 = sum2+D2;
			
			ans = sum2-sum1 +1;
			
			System.out.println("#" + tc + " " + ans);
			
			
		}//end for tc
	}
}
