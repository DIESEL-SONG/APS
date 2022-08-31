package D3;

import java.util.Scanner;

public class _1217_거듭제곱 {
	static int num;
	static int pow;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <=10; tc++) {
			sc.next();
			
			num = sc.nextInt();
			pow = sc.nextInt();
			
			System.out.println("#" + tc + " " + recur(pow));
			
		}//end for
	}//main

	private static int recur(int p) {
		if(p == 0)
			return 1;
		else
			return num * recur(p-1);
		
	}
	
	
}
