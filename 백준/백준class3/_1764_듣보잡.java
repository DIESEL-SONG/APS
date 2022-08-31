package class3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class _1764_듣보잡 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		HashSet<String> set = new HashSet<>();
		
		for(int i = 0; i < N; i++) {
			set.add(sc.next());
		}
		
		//Set은 정렬이 안되네..? set에 값이 있으면
		//리스트에 넣어서 리스트를 만들어서 정렬을 하자

		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			String nolook = sc.next();
			if(set.contains(nolook)) {
				list.add(nolook);
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.size());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
