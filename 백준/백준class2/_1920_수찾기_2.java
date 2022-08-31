package class2;

import java.util.Arrays;
import java.util.Scanner;

public class _1920_수찾기_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		int[] nums = new int[num];

		for (int i = 0; i < num; i++) {
			nums[i] = sc.nextInt();
		}
		
		Arrays.sort(nums);

		int num2 = sc.nextInt();

		int[] nums2 = new int[num2];

		for (int i = 0; i < num2; i++) {
			nums2[i] = sc.nextInt();
		}
		
		for(int i = 0; i < num2; i++) {
			System.out.println(binarySearch(nums, nums2[i]));
		}
		
	}//end main
	
	//while문을 돌렷더니 시간초과가 떠서 이진검색하라고 구선생님이 알려주심
	public static int binarySearch(int[] arr, int num) {
		int st = 0;
		int ed = arr.length-1;
		
		while(st<=ed) {
			int mid = (st+ed)/2;
			if(arr[mid] == num) {
				return 1;
			}
			
			else if(arr[mid] > num) {
				ed = mid -1;
			}
			
			else {
				st = mid+1;
			}
		}
		return 0;
	}
}
