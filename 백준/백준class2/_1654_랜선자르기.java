package class2;

import java.util.Scanner;

public class _1654_랜선자르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int N = sc.nextInt();
		
		int[] arr = new int[K];
		
		//int로 했다가 안되서 long으로 변경 
		
		long max = 0; 
		for(int i = 0; i < K; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i])
				max = arr[i];
		}
		
		//만약 길이가 1이라면 mid값이 0으로 나누어 지기때문에 max+1을 해준다.
		max = max +1;
		
		long min = 0; 
		long mid = 0;
		
		while(min < max) {
			
			mid = (max + min) / 2;
			
			long count = 0;
			
			for(int i = 0; i < arr.length; i++) {
				count += (arr[i] / mid);
			}
			
			if(count < N) {
				max = mid;
			}
			
			else {
				min = mid+1;
			}
		}
		
		
		System.out.println(min -1);
	}
}
