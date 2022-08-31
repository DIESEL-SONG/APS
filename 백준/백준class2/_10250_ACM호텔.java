package class2;

import java.util.Scanner;

public class _10250_ACM호텔 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int x = 0; //호수
		int y = 0; //층수
		for(int i =0; i < T; i ++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			if(N%H==0) {
				y = H*100;
				x = N/H;
				System.out.println(y+x);
			}
			else {
				y = (N%H)*100;
				x = N/H +1;
				System.out.println(y+x);
			}
		}
	}
}
