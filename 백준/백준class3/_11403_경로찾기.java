package class3;

import java.util.Scanner;

public class _11403_경로찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//j-k까지 갈 수 있는지, 
		//j-i로 가고, i-k로 갈 수 있는지
		for(int i = 0; i< N; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					if(arr[j][i] == 1 && arr[i][k] == 1) {
						arr[j][k] = 1;
					}
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
