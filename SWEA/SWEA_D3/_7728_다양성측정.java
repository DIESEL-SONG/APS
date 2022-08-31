package D3;

import java.util.Scanner;

public class _7728_다양성측정 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			int[] num = new int[10];
			
			for(int i = 0; i < s.length(); i++) {
				int n = s.charAt(i)-'0';
				num[n]++;
			}
			
			int cnt = 0;
			for(int i =0; i < num.length; i++) {
				if(num[i] != 0)
					cnt++;
			}
			System.out.println("#" + tc + " " + cnt);
		}
	}
}
