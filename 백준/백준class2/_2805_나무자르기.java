package class2;

import java.util.Scanner;

public class _2805_나무자르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] tree = new int[N];
		
		int min = 0; 
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			tree[i] = sc.nextInt();
			
			if(max < tree[i]) {
				max = tree[i];
			}
			
			while(min < max) {
				int mid = (min+max) / 2;
				long sum = 0;
				
				for(int treeH : tree) {
					if(treeH - mid > 0) {
						sum += (treeH-mid);
					}
				}
				
				if(sum < M) {
					max = mid;
				}
				else {
					min = mid + 1;
				}
			}
			
				
		}
		
		System.out.println(min - 1 );
	}
}
