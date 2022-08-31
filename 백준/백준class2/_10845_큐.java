package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _10845_큐 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		Queue<Integer> queue = new LinkedList<Integer>();
		
		int back = 0;
		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");

			switch (str[0]) {
			case "push":
				queue.add(Integer.parseInt(str[1]));
				back = Integer.parseInt(str[1]);
				break;
			case "pop":
				if (queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queue.poll());
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				if (queue.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "front":
				if(queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queue.peek());
				break;
			case "back":
				if(queue.isEmpty())
					System.out.println(-1);
				else {
					//가장마지막에 들어간건 push할때마다 갱신을 해준다.
					System.out.println(back);
				}
				break;
			}
		}

	}
}
