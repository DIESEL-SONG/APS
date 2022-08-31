package class1;

import java.util.Scanner;

public class _2562_최댓값 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[9];
		for(int i = 0; i < 9; i++) {
			nums[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int maxidx = 0;
		
		for(int i = 0; i < 9; i++) {
			if(max<nums[i]) {
				max = nums[i];
				maxidx = i;
			}
		}
		
		System.out.println(max);
		System.out.println(maxidx+1);
	}
}
