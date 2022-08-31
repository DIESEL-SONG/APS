package D3;

import java.util.Scanner;

public class _5549_홀수일까짝수일까 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			
			int[] c = new int[s.length()];
			for(int i = 0; i < s.length(); i++) {
				c[i] = s.charAt(i)-'0';
			}
			
			if(c[s.length()-1] % 2 == 1) {
				System.out.println("#" + tc + " " + "Odd");
			}
			else
				System.out.println("#"+ tc + " " + "Even");
		}
	}
}
