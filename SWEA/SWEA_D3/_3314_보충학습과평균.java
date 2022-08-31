package D3;

import java.util.Scanner;

public class _3314_보충학습과평균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int[] score = new int[5];
			
			int sum = 0;
			for(int i = 0; i < 5; i++) {
				score[i] = sc.nextInt();
				
				if(score[i] < 40)
					score[i] = 40;
			
				sum += score[i];
			}
			int avg = sum/5;
			System.out.println("#" + tc + " " + avg);
			
		}
	}
}
