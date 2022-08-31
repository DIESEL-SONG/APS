package D3;

import java.util.Scanner;

public class _3431_준환이의운동관리 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int L = sc.nextInt();
			int U = sc.nextInt();
			int X = sc.nextInt();
			
			int ans = 0; 
			if(X>U)
				ans = -1;
			else if (X>=L && X<=U)
				ans = 0;
			else if(X < L) 
				ans = L-X;
			
			System.out.println("#" + tc + " " + ans);
		}
	}
}
