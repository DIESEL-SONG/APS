package class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _11723_집합 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int M = Integer.parseInt(br.readLine());
		int bitmask = 0;

		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String cal = st.nextToken();
			int num;
	         // 수행연산
	         switch (cal){
	             case "add" :
	                 num = Integer.parseInt(st.nextToken());
	                 bitmask |= (1 << (num - 1));
	                 break;
	             case "remove" :
	                 num = Integer.parseInt(st.nextToken());
	                 bitmask = bitmask & ~(1 << (num - 1));
	                 break;
	             case "check" :
	                 num = Integer.parseInt(st.nextToken());
	                 sb.append((bitmask & (1 << (num - 1))) != 0 ? "1\n" : "0\n");
	                 break;
	             case "toggle" :
	                 num = Integer.parseInt(st.nextToken());
	                 bitmask ^= (1 << (num - 1));
	                 break;
	             case "all" :
	                 bitmask |= (~0);
	                 break;
	             case "empty" :
	                 bitmask &= 0;
	                 break;
	         }

		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();

	}
}
