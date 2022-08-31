import java.util.Scanner;

public class _11720_숫자의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		char[] str = sc.next().toCharArray();
		
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			cnt += (str[i]-'0');
		}
		
		System.out.println(cnt);
	}
}

