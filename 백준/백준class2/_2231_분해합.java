package class2;

import java.util.Scanner;

public class _2231_분해합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int result = 0;
		for(int i = 0; i < N; i++) {
			int num = i;
			int sum =0;
			
			
			//1의자리수를 더하고 10의 자리수를 더하는 방식으로 while문
			while(num != 0) {
				sum += num % 10; 
				num = num/10;
			}
			
			if(sum + i == N) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
		
	}
}
