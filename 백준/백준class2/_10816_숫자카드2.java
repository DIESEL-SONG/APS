package class2;

import java.util.Arrays;
import java.util.Scanner;

public class _10816_숫자카드2 {
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] Narr = new int[N];
		
		for(int i = 0; i < N; i++) {
			Narr[i] = in.nextInt();
		}
		
		Arrays.sort(Narr);	// 이분 탐색을 하기 위해서는 반드시 정렬되어있어야 한다.
		
		int M = in.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			int key = in.nextInt();
 
			// upperBound와 lowerBound의 차이 값을 구한다.
			sb.append(upperBound(Narr, key) - lowerBound(Narr, key)).append(' ');
		}
		System.out.println(sb);
	}
 
 
	private static int lowerBound(int[] arr, int key) {
		int lo = 0; 
		int ed = arr.length; 
 
		// lo가 hi랑 같아질 때 까지 반복 
		while (lo < ed) {
 
			int mid = (lo + ed) / 2; // 중간위치를 구한다.
 
			/*
			 *  key 값이 중간 위치의 값보다 작거나 같을 경우
			 *  
			 *  (중복 원소에 대해 왼쪽으로 탐색하도록 상계를 내린다.)
			 */
			if (key <= arr[mid]) {
				ed = mid;
			}
 
			else {
				lo = mid + 1;
			}
 
		}
 
		return lo;
	}
 
	private static int upperBound(int[] arr, int key) {
		int lo = 0; 
		int ed = arr.length; 
 
		// lo가 hi랑 같아질 때 까지 반복
		while (lo < ed) {
 
			int mid = (lo + ed) / 2; // 중간위치를 구한다.
 
			// key값이 중간 위치의 값보다 작을 경우
			if (key < arr[mid]) {
				ed = mid;
			}
			// 중복원소의 경우 else에서 처리된다.
			else {
				lo = mid + 1;
			}
 
		}
 
		return lo;
	}
	
}