import java.util.Scanner;

public class _2846_오르막길 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0; i <N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		int result = 0;
		
		for(int i =0; i < N-1; i++) {
			if(arr[i] < arr[i+1])
				sum += (arr[i+1]-arr[i]);
			else sum = 0;
			
			result = Math.max(sum, result);
		}
		
		System.out.println(result);
	}
}
