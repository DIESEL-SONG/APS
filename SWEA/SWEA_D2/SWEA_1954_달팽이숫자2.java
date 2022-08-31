package SWEA_D2;

import java.util.Scanner;

public class SWEA_1954_달팽이숫자2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


			int N = sc.nextInt();

			int[][] arr = new int[N][N];

			int i = 0;
			int j = -1; //(방향을 위한 변수 t를 1로 지정할건데 j는 0부터 시작해야하므로 j를 -1로 지정)
			int k = 0;
			int t = 1;
			int f = N;
			int g = N;
			while(true) {
				for(int d = 0; d < N; d++) {
					k += 1;
					j += t;
					arr[i][j] = k;
				}
				
				N --;
				
				for(int d = 0; d < N; d++) {
					k ++;
					i += t;
					arr[i][j] = k;
				}
				
				
				t *= -1; // 방향 전환
				
				if(N<=0 || N<=0)
					break;
			}
			
			for(int d = 0; d < f; d ++) {
				for(int e = 0; e < g; e++) {
					System.out.print(arr[d][e] + " ");
					
				}
				System.out.println();
			}
			

		}
	}
