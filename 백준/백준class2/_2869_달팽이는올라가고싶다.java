package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2869_달팽이는올라가고싶다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		//V / (A-B) 를 하면 틀림
		
		int cnt = (V-B) / (A-B);
		
		if((V-B) % (A-B) != 0) {
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
