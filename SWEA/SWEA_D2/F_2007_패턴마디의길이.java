package SWEA_D2;

import java.util.Scanner;

public class F_2007_패턴마디의길이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T= sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			char[] c = new char[str.length()];
			
			for(int i = 0; i < str.length(); i++) {
				c[i] = str.charAt(i);
			}
			int fidx = 0;
			int idx = 1;
			int newfidx = 0;
			while(true) {
				while(idx<str.length()) {
				if(c[fidx] != c[idx])
					idx++;
				if(c[fidx] == c[idx])
					newfidx = idx;
					break;
				}
				fidx++;
				idx++;
				
					
			}
		}//end for tc
	}
}
