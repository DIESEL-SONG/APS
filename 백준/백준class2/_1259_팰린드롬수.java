package class2;

import java.util.Scanner;

public class _1259_팰린드롬수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//마지막에 0이 나오고 그 0은 포함이 안된다고 했으니 
		//while 문으로 확인해준다
		while (true) {
			//문자열을 입력받고
			String str = sc.next();
			
			//0을 입력받으면 멈춘다.
			if(str.equals("0"))
				break;
			//reverse를해주기위해 StringBuilder를 선언하고
			StringBuilder sb = new StringBuilder(str);

			//새로운문자열로 reverse를 만들어준다.
			String s = sb.reverse().toString();
			
			if (str.equals(s))
				System.out.println("yes");
			else
				System.out.println("no");
			
		}

	}
}
