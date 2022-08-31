package class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class _5430_AC3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			// 명령
			String s = br.readLine();

			// 배열의 길이
			int num = Integer.parseInt(br.readLine());
			int[] arr = new int[num];

			// 배열
			String arrstr = br.readLine();
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

			boolean check = true;
//			System.out.println(Arrays.toString(str));
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == 'D') {
					if (list.size() == 0) {
						bw.write("error\n");
						check = false;
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
			bw.flush();
			if(list.size()!= 0 || check == true) {	
			System.out.println(list);
			}
		}
	}
}