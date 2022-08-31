package class3;

import java.util.Scanner;

public class _1676_팩토리얼0의개수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int twocnt = 0;
		int fivecnt = 0;
		
		//끝자리가 0이나오는것은 10의 배수이며, 2와 5로 나누어지는 수일때이다.
		//
		for(int i = 1; i <=N; i++) {
			int num = i;
			
			while(num%2==0) {
				twocnt++;
				num = num/2;
			}
			
			while(num%5 == 0) {
				fivecnt++;
				num = num/5;
			}
		}
		
		System.out.println(Math.min(twocnt, fivecnt));
	}
}
