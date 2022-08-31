package class2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
import java.util.HashSet;

public class _10814_나이순정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[][] member = new String[n][3];

		int age = 0;
		String name = null;
		for (int i = 0; i < n; i++) {
			member[i][0] = sc.next();
			member[i][1] = sc.next();
			member[i][2] = Integer.toString(i);
		}

		// arrays.sort의 compare to를 이용해서 비교.
		// 나이가 같을 경우엔 가입순서로 비교
		// 나이가 다를때는 앞의 나이와 뒤에 나이를 빼서 비교. -1, 0, 1
		
		Arrays.sort(member, (a, b) -> {
			if (a[0] == b[0]) {
				return a[2].compareTo(b[2]);
			} 
			else
				return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
		});
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(member[i][j] + " ");				
			}
			System.out.println();
		}
	}
}
