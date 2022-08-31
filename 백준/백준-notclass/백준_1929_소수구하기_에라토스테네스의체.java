import java.util.Scanner;

public class 백준_1929_소수구하기_에라토스테네스의체 {
	static int M , N;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		M = sc.nextInt();
		N = sc.nextInt();
		
		Is_prime(M,N);

	}
	static void Is_prime(int a, int b) {
		for (int i = a; i <= b; i++) {
			int cnt = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) 
					cnt++;
			}
			if(cnt ==0 && i != 0) {
				System.out.println(i);
			}
		}
	}
}
