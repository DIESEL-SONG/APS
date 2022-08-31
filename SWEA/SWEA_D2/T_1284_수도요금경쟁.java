package SWEA_D2;

import java.util.Scanner;

public class T_1284_수도요금경쟁 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 입력받기
		int T = sc.nextInt();
		
		for(int tc = 1; tc<= T; tc++) {
			int P = sc.nextInt(); //A사 리터당 요금
			int Q = sc.nextInt(); //B사 기본요금 R리터 전까지
			int R = sc.nextInt(); //B사 R기준
			int S = sc.nextInt(); //B사 R초과시 리터당요금
			int W = sc.nextInt(); //종민이의 물 사용량
			
			//A사 총 요금
			int A = P * W;
			int B = 0;
			//B사 R리터 이하, 초과시 따로 계산
			if(W <= R) {
				B = Q;				
			}
			else if(W>R) {
				B = Q + (W-R)*S;
			}
			
			int min = Integer.MAX_VALUE;
			
			min = A < B ? A : B;
			
			System.out.printf("#%d %d\n", tc, min);
		}//end for tc
	}
}
