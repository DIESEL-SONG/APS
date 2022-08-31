package class2;

import java.util.Scanner;

public class _1920_수찾기_시간초과 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long num = sc.nextLong();

		long[] nums = new long[(int) num];

		for (int i = 0; i < num; i++) {
			nums[i] = sc.nextLong();
		}

		long num2 = sc.nextLong();

		long[] nums2 = new long[(int) num2];

		for (int i = 0; i < num2; i++) {
			nums2[i] = sc.nextLong();
		}
		int ans = 0;
		int i = 0;
		while (i < num2) {
			for (int j = 0; j < num; j++) {
				if (nums2[i] == nums[j]) {
					ans = 1;
					break;
				}
				else
					ans = 0;

			}
			System.out.println(ans);
			i++;
		}
		
	}
}
