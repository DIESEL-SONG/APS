package _1트;

import java.util.Arrays;
import java.util.Scanner;

public class _2309_일곱난쟁이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] height = new int[9];
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			height[i] = sc.nextInt();
			sum += height[i];
		}
		
		int notseven = Math.abs(100-sum);
		int x1 = 0;
		int x2 = 0;
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(i != j) {
					if(height[i] + height[j] == notseven) {
						x1 = i;
						x2 = j;
					}
				}
			}
		}
		
		int[] height7 = new int[7];
		
		int a = 0;
		for(int i =0; i < 9; i++) {
			if(i != x1 && i != x2) {
				height7[a] = height[i];
				a++;
			}
		}
		
		Arrays.sort(height7);
		
		for(int i = 0; i < 7; i++) {
			System.out.println(height7[i]);
		}
	}
}
