package SWEA_D2;

import java.util.Scanner;

public class _1961_숫자배열회전 {
	static int N;
	static int[][] arr;

	public static int[][] Rotation(int[][] arr){
		int[][] tmp_arr = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j< N; j++) {
				tmp_arr[i][j] = arr[N-1-j][i];
			}
		}
		return tmp_arr;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();

			arr = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			int[][] arr90 = Rotation(arr);
			int[][] arr180 = Rotation(arr90);
			int[][] arr270 = Rotation(arr180);
			
			System.out.println("#" + tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(arr90[i][j]);
				}
				System.out.print(" ");
				
				for (int j = 0; j < N; j++) {
					System.out.print(arr180[i][j]);
				}
				System.out.print(" ");
				for (int j = 0; j < N; j++) {
					System.out.print(arr270[i][j]);
				}
				System.out.println();
				
			}
			

		} // end for tc
	}
}
