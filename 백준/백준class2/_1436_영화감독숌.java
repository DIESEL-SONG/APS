package class2;

import java.util.Scanner;

public class _1436_영화감독숌 {
	public static void main(String[] args) {
		//영화제목이 앞에만 숫자가 붙는게아니라 666이 들어가는 숫자 순서대로 
		//카운트해야한다.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int title = 666;
		int cnt = 1;
		
		//int -> String으로 변환하는방법
		//1. integer.toString(int값)
		//2. String.valueOf(int값)
		
		while(cnt < N) {
			//title을 1씩 증가시켜가면서
			title++;
			//N-1번째에 666이 포함된 숫자를 출력한다.
			if(Integer.toString(title).contains("666")) {
				cnt++;
			}
		}
		System.out.println(title);
	}
}
