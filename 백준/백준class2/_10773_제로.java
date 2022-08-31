package class2;

import java.util.Scanner;
import java.util.Stack;

public class _10773_제로 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//스택을 만들어서
		//0을 만날때마다 pop
		//0이 아니면 push
		Stack<Integer> stack = new Stack<>();
		
		int n = sc.nextInt();
		
		for(int i =0; i < n; i++) {
			int num = sc.nextInt();
			
			if(num == 0) {
				stack.pop();
			}
			else
				stack.push(num);
		}
		
		//stack안에 들어있는 값들을
		//stack이 빌때까지 sum에다가 더해준다.
		int sum = 0;
		while(!stack.isEmpty()) {
			sum+= stack.pop();
		}
		
		System.out.println(sum);
	}
}
