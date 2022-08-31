import java.util.Scanner;

public class _1110_더하기사이클 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int T = N;
		int cnt = 0;
		while(true) {
			N = ((N%10)*10) + (((N/10)+(N%10))%10);
			cnt ++;
			
			if(T == N)
				break;
		}
		System.out.println(cnt);
	}
}

