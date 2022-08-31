package SWEA_D2;

import java.util.Scanner;

public class SWEA_1945_소인수분해 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[5];
			

			while(N != 1) {
				
				if(N%2 == 0) {
					N /= 2;
					arr[0]++;
				}
				if(N%3 == 0) {
					N /= 3;
					arr[1]++;
				}
				if(N%5 == 0) {
					N /= 5;
					arr[2]++;
				}
				if(N%7 == 0) {
					N /= 7;
					arr[3]++;
				}
				if(N%11 == 0) {
					N /= 11;
					arr[4]++;
				}

				
			}
				
			System.out.print("#" + tc + " ");
			for(int i = 0; i < 5; i++)
				System.out.print(arr[i] + " ");
			System.out.println();
		}//end for tc
		
	}
}
