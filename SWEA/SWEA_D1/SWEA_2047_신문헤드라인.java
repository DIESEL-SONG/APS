package SWEA_API_D1;

import java.util.Scanner;

public class SWEA_2047_신문헤드라인 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String headline = sc.nextLine();
		
		char[] c = new char[headline.length()];
		
		for(int i = 0; i < headline.length(); i++) {
			c[i] = headline.charAt(i);
			for(int j = 0; j < c.length; j++) {
				if(c[j] >= 97 && c[j]<=122) {
					c[j] = (char) (c[j]-32);
			}
			}
		}
		for(int i =0; i < c.length; i++)
			System.out.print(c[i]);
	}
}

