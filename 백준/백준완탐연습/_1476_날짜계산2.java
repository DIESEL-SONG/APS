package _1트;

import java.util.Scanner;

public class _1476_날짜계산2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// E 1~15
		// S 1_28
		// M 1~19

		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		
		int e = 1;
		int s = 1;
		int m = 1;
		
		int year = 1;
		while (true) {
			if(e ==E && s == S && m ==M)
				break;
			e++;
			s++;
			m++;
			
			if(e == 16)
				e = 1;
			if(s == 29)
				s = 1;
			if(m == 20)
				m = 1;
			year++;
		}

		System.out.println(year);

	}
}
