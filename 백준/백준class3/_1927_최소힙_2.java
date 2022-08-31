package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class _1927_최소힙_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//정수가들어오면 그 숫자를 힙에 추가
		//0이 들어오면 최솟값을 출력하고 배열에서 삭제
		//우선순위큐.. 문제 api를 사용하자
		//시간초과(스캐너->bufferedreader로 바꿔보겠음 --> 맞음)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				if(queue.isEmpty())
					System.out.println(0);
				else
					System.out.println(queue.poll());
			}
			else
				queue.add(num);
		}
	}
}
