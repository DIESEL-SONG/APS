package SWEA_API_D1;

import java.util.Scanner;

public class SWEA_2068_최대수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int[] arr = new int[10];
		for(int i = 1; i <= T; i ++) {
			int max = Integer.MIN_VALUE;
			for(int tc = 0; tc < 10; tc++) {
				arr[tc] = sc.nextInt();			
				if(arr[tc] > max)
					max = arr[tc];
			}
			System.out.println("#" + i + " " + max);
		}
		
		
		
	}
}
