package class2;

import java.util.Scanner;

public class _1735_분수합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int j1 = sc.nextInt();
		int m1 = sc.nextInt();
		int j2 = sc.nextInt();
		int m2 = sc.nextInt();
		int j = 0;
		int m = 0;
		if(m1==m2) {
			j = j1+j2;
			if(j%m1 == 0)
				j = j/m1;
			m = 0;
		}
		
		else if(m1 != m2) {
			m = m1*m2;
			j1 = j1*m2;
			j2 = j2*m1;
			j = j1+j2;
			
		}
	}
}
