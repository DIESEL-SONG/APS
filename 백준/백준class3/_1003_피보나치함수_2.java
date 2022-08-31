package class3;

import java.io.IOException;
import java.util.Scanner;

public class _1003_피보나치함수_2 {
	static int zerocnt;
	static int onecnt;
	static int N;
	public static void main(String[] args) throws IOException {
		//scanner..시간초과..
		//Scanner의 문제가 아니었네
		//구선생님 찾아보니 일반 재귀로는 해결을 못하고
		//메모이제이션을 써줘야한다고 함.

		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			//피보나치함수로 ㄱㄱ
			fibonacci(sc.nextInt());
			System.out.println(zerocnt+ " " + onecnt);
			zerocnt = 0;
			onecnt = 0;
		}
	}
	
	public static void fibonacci(int n) {		
		
		int tmp0 = 0; //fibonacci(0) 값
		int tmp1 = 1; //fibonacci(1) 값
		int tmp = 0; // fibonacci(n-1) fibonnaci(n-2)를 더한 값
		
		//0에 걸리면 cnt++
		if(n==0) {
			zerocnt++;
			return;
		}
		//1에 걸리면 cnt++
		else if(n==1) {
			onecnt++;
			return;
		}
		//0보다 작아지면 멈추기
		else if(n < 0) {
			return;
		}
		//반복문을 돌면서 값들을 저장해준다.
		else {
			for(int i = 2; i <= n; i++) {
				tmp = tmp0 + tmp1; //fibo(i)의 값
				tmp0 = tmp1; //fibo(i-2)를 fibo(i-1)로 갱신
				tmp1 = tmp; //fibo(i-1)을 fibo(i)값으로 갱신 그리고 i++되어 다시 for문
			}
			//값에 저장된만큼 0과 1이 불렸으므로 그 값을 저장해준다.
			zerocnt = tmp0; 
			onecnt = tmp1;
		}
	}
}
