package D3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class _5948_새샘이의735 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int[] arr = new int[7];
			Set<Integer> hs = new HashSet<Integer>();
			
			for(int i = 0; i < 7; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if (i != j) {
						for (int k = j+1; k < arr.length; k++) {
							if (j != k) {
								hs.add(arr[i] + arr[j] + arr[k]);
							}
						}
					}
				}
			}

			List<Integer> list = new ArrayList<Integer>(hs);
			Collections.sort(list, Collections.reverseOrder());
			System.out.println("#" + tc + " " + list.get(4));
		}
	}
}
