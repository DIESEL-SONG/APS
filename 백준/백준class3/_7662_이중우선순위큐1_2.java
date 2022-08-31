package class3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

public class _7662_이중우선순위큐1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 0; tc < T; tc++) {
			int K = sc.nextInt();
			TreeMap<Integer, Integer> map = new TreeMap<>();

			for (int i = 0; i < K; i++) {
				String s = sc.next();

				switch (s) {
				case "I":
					int num = sc.nextInt();
					// map.put(키(key), 값(value))
					// getOrDefault는 찾는 키가 존재하면 해당키의 값을 반환하고 없으면 기본값을 반환한다
					// map.getOrDefault(num이라는 키, num이 존재하면 num의 value 주고 아니면 0을 줘) 그리고 +1을 해.
					// +1을 하는 이유는 동일 키 값이 추가 될 경우, Value가 덮어쓰기 되므로(중복허용x)
					//즉, 처음들어오는 값이라면 value가 1, 2번째로 들어오는 값이면 2... 이런식으로 들어온다.
					// 그래서 같은 값이 여러번 존재할 경우 value값을 증가시켜 몇개가 존재하는지 알기위해 사용
					map.put(num, map.getOrDefault(num, 0) + 1);
					break;
				case "D":
					num = sc.nextInt();
					int delete; // 삭제할 값
					if (map.size() == 0)
						continue;
					if (num == 1) {
						delete = map.lastKey(); // 최대값
					} else
						delete = map.firstKey(); // 최소값

					if (map.get(delete) == 1) {
						map.remove(delete);
					}
					else
						map.put(delete, map.get(delete)-1);
					break;
				}
			}

			if(map.size() == 0)
				System.out.println("EMPTY");
			else
				System.out.println(map.lastKey() + " " + map.firstKey());
		}//tc

	}
}
