package SWEA_API_D1;

import java.util.Scanner;

public class SWEA_2043_서랍의비밀번호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		
		int K = sc.nextInt();
		
		if(P>K)
			System.out.println(P-K+1);
		
	}
}
