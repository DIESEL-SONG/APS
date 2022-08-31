package SWEA_API_D1;

import java.util.Scanner;

public class SWEA_2063_중간값찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		//버블정렬
		for(int i = 0; i < N-1; i++) {
			for(int j = i+1; j < N; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		
		System.out.println(arr[(N/2)]);
	}
}

