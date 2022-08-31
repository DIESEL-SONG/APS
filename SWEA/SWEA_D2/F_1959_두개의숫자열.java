package SWEA_D2;

import java.util.Scanner;

public class F_1959_두개의숫자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] Narr= new int[N];
			int[] Marr= new int[M];
			
			for(int i = 0; i < N; i++) {
				Narr[i] = sc.nextInt();
			}
			
			for(int i = 0; i < M; i++) {
				Marr[i] = sc.nextInt();
			}
			int sum = 0;
			int max = Integer.MIN_VALUE;
			if(N<M) {
				for(int i = 0; i < M-N+1; i ++) {
					sum = 0;
					for(int j = 0; j < N; j++) {
						sum += Marr[i+j] * Narr[j];
					}
					if(max < sum)
						max = sum;
				}
			}// end if N < M
			
			else if(M < N) {
				for(int i = 0; i < N-M+1; i++) {
					sum = 0;
					for(int j = 0; j < M; j++) {
						sum += Narr[i+j] * Marr[j];
					}
					if(max < sum)
						max = sum;
				}
			}//end else if M < N
			System.out.println("#" + tc + " " + max);
		}//end for tc
	}
}
