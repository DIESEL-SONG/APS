package class2;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _11866_요세푸스0 {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			queue.offer(i + 1);
		}
		// 큐 입력 확인 완료
//		System.out.println(queue);
		
		
		//출력할때 앞뒤로 < >를 입력해줘야해서 스트링 빌더를 써서 입력한다.
		sb.append("<");
		int cnt = 0;
		while (queue.size() != 1) {
			//K-1번째까지는 처음에 있던 값을 맨 뒤로 보낸다.
			for(int i = 0; i < K-1; i++) {
				//삭제 한 값을 맨뒤에 넣는다
				queue.offer(queue.poll());
			}
			
			//K번째 값은 poll한후 출력
			sb.append(queue.poll() + ", ");
		}
		
		//마지막 값은 >를 붙ㅇ서 출력해줘야해서 따로 뽑는다.
		sb.append(queue.poll() + ">");
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();

	}
}

