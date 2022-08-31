package D3;

import java.util.Scanner;

public class _6730_장애물경주난이도 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
		
			int[] nums = new int[N];
			int up = 0;
			int down = 0;
			
			for(int i = 0; i < N;i++) {
				nums[i] = sc.nextInt();
			}
			
			for(int i = 0; i < N-1; i++) {	
				if(nums[i] < nums[i+1]) {
					int tmp = nums[i+1] - nums[i];
					if(tmp > up) {
						up = tmp;
					}
				}
				else if(nums[i] > nums[i+1]) {
					int tmp = nums[i] - nums[i+1];
					if(tmp > down) {
						down = tmp;
					}
				}
			}
			
			System.out.println("#" + tc + " " + up + " " + down);
			
		}
	}
}
