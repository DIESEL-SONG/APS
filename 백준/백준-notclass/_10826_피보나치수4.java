import java.math.BigInteger;
import java.util.Scanner;

public class _10826_피보나치수4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		//왜? +2? 
		BigInteger[] dp = new BigInteger[N+1];
		
		dp[0] = BigInteger.ZERO;
		if(N > 0) {
			dp[1] = BigInteger.ONE;			
		}
		
		for(int i = 2; i <= N; i++) {
			dp[i] = dp[i-2].add(dp[i-1]);
		}
		
		System.out.println(String.valueOf(dp[N]));
	}
}
