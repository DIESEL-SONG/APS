import java.math.BigInteger;
import java.util.Scanner;

public class _2749_피보나치3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		long N = sc.nextLong();
		
		long[] dp = new long[(int) (N+1)];
		
		dp[0] = 0;
		dp[1] = 1;
		
		
		for(int i = 2; i < dp.length; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		System.out.println(dp[dp.length]);
	}
}
