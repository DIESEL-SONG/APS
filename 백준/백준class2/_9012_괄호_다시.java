package class2;

import java.util.Scanner;
import java.util.Stack;

public class _9012_괄호_다시 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String bracket = sc.next();
			char[] c = new char[bracket.length()];


			int check = 0;

			for (int j = 0; j < bracket.length(); j++) {
				c[j] = bracket.charAt(j);
				
				if (c[j] == '(')
					check +=1;
				
				else if (c[j] == ')') {
					check -=1;

				}

			}
			
			if (check == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	
}
