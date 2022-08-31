package D3;

import java.util.Scanner;

public class _5431_민석이의과제체크하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] homework = new int[N+1];
			
			int person = sc.nextInt();
			
			for(int i = 0; i <person; i++) {
				int num = sc.nextInt();
				homework[num]++; 
			}
			
			System.out.print("#" + tc + " ");
			for(int i = 1; i <= N; i++) {
				if(homework[i] == 0) {
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}
}
