import java.util.Scanner;

public class _2747_피보나치수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		
		int[] num = new int[n+1];
		
		num[0] = 0;
		num[1] = 1;
		for (int i = 2; i <= n; i++) {
			num[i] = num[i-1]+num[i-2];
		}
		
		System.out.println(num[n]);
	}
}

