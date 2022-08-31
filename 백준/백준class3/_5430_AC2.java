package class3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _5430_AC2 {
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
			arrstr = arrstr.substring(1, arrstr.length() - 1);
			String[] str = arrstr.split(",");
			List<Integer> list = new ArrayList<>();

			for (int i = 0; i < num; i++) {
				arr[i] = Integer.parseInt(str[i]);
//				System.out.println(arr[i]);
				list.add(arr[i]);
			}
			//똑같은 리스트를 하나 만든다
			List<Integer> newlist = list;

//			System.out.println(Arrays.toString(str));
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == 'D') {
					if (list.size() == 0) {
						System.out.println("error");
					} else {
						list.remove(list.get(0));
					}
					//삭제한후에똑같이만들어줌
					newlist = list;
				} else if (c == 'R') {
					list = new ArrayList<>();					
					for(int j = newlist.size()-1; j>=0; j--) {
						list.add(newlist.get(j));
					}
					newlist = list;
				}
			}
			if(list.size()!= 0) {
				
			System.out.println(list);
			}
		}
	}
}