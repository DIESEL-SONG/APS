package SWEA_D2;

import java.util.Scanner;

public class SWEA_1954_달팽이숫자3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] arr = new int[N][N];
		
		int i = 0;
		int j = -1;
		int t = 1;
		int c = 0;
		int x = N;
		int y = N;
		
		while(true) {
			for(int a = 0; a < N; a ++) {
				c += 1;
				j += t;
				arr[i][j] = c;
			}
			
			N --;
			
			for(int a = 0; a < N; a++) {
				c +=1;
				i += t;
				arr[i][j] = c;
			}
			
			t *= -1;
			
			if( N <= 0 ) {
				break;
			}
			
		}
		
		for(int a = 0; a < y; a++) {
			for(int b = 0; b < x; b++) {
				System.out.print(arr[a][b] + " ");
			}
			System.out.println();
		}
		
	}

}
