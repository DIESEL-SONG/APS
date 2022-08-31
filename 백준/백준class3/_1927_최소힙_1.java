package class3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _1927_최소힙_1 {
	public static void main(String[] args) {
		//정수가들어오면 그 숫자를 힙에 추가
		//0이 들어오면 최솟값을 출력하고 배열에서 삭제
		//우선순위큐.. 문제 api를 사용하자
		//시간초과
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
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
