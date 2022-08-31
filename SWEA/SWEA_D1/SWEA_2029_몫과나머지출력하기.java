package SWEA_API_D1;

import java.util.Scanner;

public class SWEA_2029_몫과나머지출력하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("#" + tc + " " + num1/num2 + " " + num1%num2);
		}		
	}
}
