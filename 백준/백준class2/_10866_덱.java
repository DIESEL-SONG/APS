package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class _10866_덱 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Integer> deque = new LinkedList<Integer>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String[] s = br.readLine().split(" ");
			
			switch(s[0]) {
			case "push_front":
				deque.addFirst(Integer.parseInt(s[1]));
				break;
			case "push_back":
				deque.addLast(Integer.parseInt(s[1]));
				break;
			case "pop_front":
				if(deque.isEmpty())
					bw.write(-1+"\n");
				else
					bw.write(deque.pollFirst()+"\n");
				break;
			case "pop_back":
				if(deque.isEmpty())
					bw.write(-1+"\n");
				else
					bw.write(deque.pollLast()+"\n");
				break;
			case "size":
				bw.write(deque.size()+"\n");
				break;
			case "empty":
				if(deque.isEmpty())
					bw.write(1+"\n");
				else
					bw.write(0+"\n");
				break;
			case "front":
				if(deque.isEmpty())
					bw.write(-1+"\n");
				else
					bw.write(deque.peekFirst()+"\n");
				break;
			case "back":
				if(deque.isEmpty())
					bw.write(-1+"\n");
				else
					bw.write(deque.peekLast()+"\n");
				break;
			
			}
		}
		bw.flush();
		bw.close();
		
	}
}
