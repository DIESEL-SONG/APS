package D3;

import java.util.Scanner;
import java.util.Stack;

public class _1234_비밀번호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc <= 10; tc++) {
			Stack<Integer> stack = new Stack<>();
			int n = sc.nextInt();
			String s = sc.next();
			
			for(int i = 0; i < n; i++) {
				int num = s.charAt(i)-'0';
				
				if(stack.isEmpty() || num != stack.peek()) {
					stack.push(num);
				}
				else {
					stack.pop();
				}

			}

			int[] ans = new int[stack.size()];
			//거꾸로 집어넣던가, 아니면 차례대로 집어넣어서 오름차순으로 정렬하던가
			//거꾸로 집어넣는방법을 택했다.
			while(!stack.isEmpty()) {
				int i = stack.size()-1;
				ans[i] = stack.pop();
				i--;
			}			
			System.out.print("#" + tc + " ");
			for(int i = 0; i < ans.length; i++) {
				System.out.print(ans[i]);
			}
			System.out.println();
		}
	}
}
