package D3;

import java.util.Scanner;

public class _5603_건초더미 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			int sum = 0;
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			
			int cnt = 0;
			int avg = sum/N;
			for(int i = 0; i < N; i++) {
				if(arr[i]-avg>0) {
					cnt += arr[i] - avg;					
				}
				else {
					cnt += avg - arr[i];
				}
			}
			
			System.out.println("#" + tc + " " + cnt/2);
			
			
		}
	}
}
