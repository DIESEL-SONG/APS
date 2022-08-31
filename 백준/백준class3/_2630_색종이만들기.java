package class3;

import java.util.Scanner;

public class _2630_색종이만들기 {
	static int w;
	static int b;
	static int[][] paper;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		paper = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				paper[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println(w);
		System.out.println(b);
	}
	
	
}
