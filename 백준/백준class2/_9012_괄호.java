package class2;

import java.util.Scanner;
import java.util.Stack;

public class _9012_괄호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String bracket = sc.next();
			char[] c = new char[bracket.length()];
			Stack<Character> stack = new Stack<>();

			boolean check = true;

			for (int j = 0; j < bracket.length(); j++) {
				c[j] = bracket.charAt(j);
				
				if (c[j] == '(')
					stack.push(c[j]);
				
				else if (c[j] == ')') {
					if (stack.isEmpty()) {
						check = false;	
						break;
					}
					else
						stack.pop();

				}
			}
			

			if (check && stack.isEmpty())
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
