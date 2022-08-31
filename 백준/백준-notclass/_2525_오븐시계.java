import java.util.Scanner;

public class _2525_오븐시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int time = sc.nextInt();
		
		M = time + M;
		
		if(M >= 60) {
			H = H + M/60;
			M = M % 60;
			
		}
			
		if(H >= 24)
			H = H%24;
		
		
		System.out.println(H + " " + M);
	}
}
