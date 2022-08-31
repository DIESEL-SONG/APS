package class2;

import java.util.Scanner;

public class _2775_부녀회장이될테야 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//배열을 만들어서 먼저 숫자 채워주기
		int[][] apt = new int[15][15];
		
		for(int i = 0; i < 15; i++) {
			apt[i][1] = 1;
			apt[0][i] = i;
		}
		
		for(int i = 1; i < 15; i++) {
			for(int j = 2; j < 15; j++) {
				apt[i][j] = apt[i][j-1] + apt[i-1][j];
			}
		}
		
		//테케의 갯수
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(apt[k][n]);
		}
	}
}
