package D3;

import java.util.Scanner;

public class _1221_GNS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] number = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			String s = sc.nextLine();
			String[] str = s.split(" ");
			int num = Integer.parseInt(str[1]);
			
			String val = sc.nextLine();
			String[] arr = val.split(" ");
			
			System.out.println("#" + tc);
			
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < num; j++) {
					if(arr[j].equals(number[i])) {
						System.out.print(arr[j] + " ");
					}
				}
			}
			System.out.println();
		}
	}
}
