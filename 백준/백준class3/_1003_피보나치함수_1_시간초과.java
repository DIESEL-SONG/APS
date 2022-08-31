package class3;

import java.util.Scanner;

public class _1003_피보나치함수_1_시간초과 {
	static int zerocnt;
	static int onecnt;
	static int N;
	public static void main(String[] args) {
		//scanner..시간초과..
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			//cnt 초기화
			zerocnt = 0;
			onecnt = 0;
			//피보나치함수로 ㄱㄱ
			fibonacci(sc.nextInt());
			System.out.println(zerocnt+ " " + onecnt);
		}
	}
	
	public static void fibonacci(int n) {
		//0에 걸리면 cnt++
		if(n==0) {
			zerocnt++;
		}
		//1에 걸리면 cnt++
		else if(n==1) {
			onecnt++;
		}
		//0보다 작아지면 멈추기
		else if(n < 0) {
			return;
		}
		//피보나치가 (n-1)+(n-2)이므로 n-1.n-2가 0혹은 1에 걸리도록 재귀호출
		else {
			fibonacci(n-1);
			fibonacci(n-2);
		}
	}
}
