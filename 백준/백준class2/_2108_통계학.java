package class2;

import java.util.Scanner;

public class _2108_통계학 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		// 입력값의 범위 : -4000 ~ 4000
		int[] arr = new int[8001];


		/*
		 * sum = 총 합계 
		 * max = 최댓값 
		 * min = 최솟값 
		 * median = 중앙값 
		 * mode = 최빈값
		 */

		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		int median = 4001;
		int mode = 4001;

		for (int i = 0; i < N; i++) {
			int value = sc.nextInt();
			sum += value;
			arr[value + 4000]++;

			if (max < value) {
				max = value;
			}
			if (min > value) {
				min = value;
			}

		}

		int count = 0; 
		int mode_max = 0; 


		boolean flag = false;

		for (int i = min + 4000; i <= max + 4000; i++) {

			if (arr[i] > 0) {

			
				if (count < (N + 1) / 2) {
					count += arr[i]; 
					median = i - 4000;
				}

				
				if (mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true; 
				}
				
				else if (mode_max == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;
				}
			}
		}

		System.out.println((int) Math.round((double) sum / N)); 
		System.out.println(median); 
		System.out.println(mode); 
		System.out.println(max - min); 
	}
}
