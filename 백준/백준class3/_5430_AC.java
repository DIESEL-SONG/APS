package class3;

import java.util.Arrays;
import java.util.Scanner;

public class _5430_AC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 0; tc < T; tc++) {
			// 명령
			String s = sc.next();

			// 배열의 길이
			int num = sc.nextInt();
			int[] arr = new int[num];
			
			// 배열
			String arrstr = sc.next();
			arrstr = arrstr.substring(1, arrstr.length()-1);
			String[] str = arrstr.split(",");
			
			for(int i = 0; i < num; i++) {
				arr[i] = Integer.parseInt(str[i]);
				System.out.println(arr[i]);
			}
					
//			System.out.println(Arrays.toString(str));
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == 'R') {

					int[] newarr = new int[arr.length];
					for (int j = arr.length - 1; j >= 0; j--) {
						int a = 0;
						newarr[j] = arr[a];
						// 덮어쓰
						a++;
					}
					arr = newarr;

				} else if (c == 'D') {
					if (arr.length == 0) {
						System.out.println("error");
						break;
					} else {
						int[] newarr1 = new int[arr.length - 1];
						for (int j = 0; j < arr.length - 1; j++) {
							newarr1[j] = arr[j + 1];
						}
						arr = newarr1;
					}

				}

			}
			if(arr.length>0) {
			System.out.println(Arrays.toString(arr));
			}
		}
	}
}