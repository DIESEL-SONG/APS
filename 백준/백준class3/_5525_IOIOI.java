package class3;

import java.util.Scanner;

public class _5525_IOIOI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int S = sc.nextInt();
		
		char[] str = sc.next().toCharArray();
		
		int ans = 0;
		int cnt = 0;
		
		for(int i = 1; i < S-1; i++) {
			if(str[i-1] == 'I' && str[i] =='O' && str[i+1] == 'I')
				cnt++;
		}
		
	}
}
