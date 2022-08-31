package D3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _4466_최대성적표만들기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc =1; tc<=T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[] score = new int[N];
			
			for(int i = 0; i < N; i++) {
				score[i] = sc.nextInt();
			}
			
			Arrays.sort(score);
			
			
			int sum = 0;
			for(int i = N-1; i >= N-K; i--) {
				sum += score[i];
				
			}
			
			System.out.println("#" + tc + " " + sum);
		}
	}
}
