package D3;

import java.util.Scanner;

public class _3456_직사각형길이찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			
			int[] square = new int[101];
			
			for(int i = 0; i < 3; i++) {
				square[sc.nextInt()]++;
			}
			
			for(int i = 0; i < 101; i++) {
				if(square[i] ==1 || square[i] ==3)
					System.out.println("#" + tc + " " + i);
			}
		}
	}
}
