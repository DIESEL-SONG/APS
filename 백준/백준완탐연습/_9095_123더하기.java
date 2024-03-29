package _1트;

import java.util.Scanner;

public class _9095_123더하기 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int T = sc.nextInt();
		for(int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			
			int[] dp = new int[n+1];
			dp[1] = 1;
			if(n > 1) {
				dp[2] = 2;
			}
			if(n > 2) {
				dp[3] = 4;
			}
			
			for(int i = 4; i <= n; i++) {
				dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
			}
			
			System.out.println(dp[n]);
			
		}
	}


	
}
