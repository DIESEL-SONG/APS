package class2;

import java.util.Scanner;

public class _18111_마인크래프트_1_시간초과 {
	public static void main(String[] args) {
		//시간초과... 뭐가 문제지..
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int B = sc.nextInt();
		
		int[][] map = new int[N][M];
		int mint = Integer.MAX_VALUE; //최소시간
		int maxh = 0; //최대높이
		//맵에 땅 높이 입력
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		int height = 0;
		int cnt = 257;
		
		while(cnt>0) {
			cnt --;
			int a = 0;
			int b = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					int tmp = map[i][j]-height;
					if(tmp > 0)// 높이를 줄여야 하는 경우
						a += tmp;
					else if( tmp < 0)
						b += (-tmp);
				}
			}
			
			int time = a * 2 + b *1;
			if(time >= 0 && (B+a-b)>=0) {
				if(mint >= time) {
					mint = time;
					if(maxh < height)
						maxh = height;
				}
			}
			height++;
			
			
		}
		System.out.println(mint+ " " + maxh);
		
	}
}
