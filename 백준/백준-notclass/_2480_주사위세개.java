import java.util.Scanner;

public class _2480_주사위세개 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int max = 0;
		if(A==B&&B==C) {
			System.out.println(10000+(A*1000));
		}
		else if(A==B&&B!=C) {
				System.out.println(1000+(A*100));
		}
		else if(B==C&&A!=C) {
				System.out.println(1000+(B*100));
		}
		else if(A==C&&B!=C) {
				System.out.println(1000+(C*100));
		}
		else {
			max = A>B? A:B;
			max = max>C ? max:C;
			System.out.println(max*100);
		}
	}
}

