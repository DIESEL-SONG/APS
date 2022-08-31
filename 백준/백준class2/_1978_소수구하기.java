package class2;

import java.util.Scanner;

public class _1978_소수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 소수먼저 구하기(에라토테네스의 체)
		int[] prime = new int[1001];
		for (int i = 2; i < prime.length; i++) {
			int j = 2;
			while (true) {
				if (i * j > 1000)
					break;
				// 소수가 아닌것을 1로 변
				prime[i * j] = 1;
				j++;
			}
			prime[1] = 1;
		}

		int M = sc.nextInt();
		
		int[] arr = new int[M];
		
		for(int i = 0; i < M; i++) {
			arr[i]= sc.nextInt();			
		}
		int cnt = 0;
		for(int i = 0; i < M; i++) {
			if(prime[arr[i]] != 1)
				cnt++;
		}
		System.out.println(cnt);
		
	}
}
