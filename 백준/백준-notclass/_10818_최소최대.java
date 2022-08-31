import java.util.Scanner;

public class _10818_최소최대 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] nums = new int[N];
		
		for(int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < N; i++) {
			min = min < nums[i] ? min : nums[i];
			max = max > nums[i] ? max : nums[i];
		}
		
		System.out.printf("%d %d", min, max);
	}
}
