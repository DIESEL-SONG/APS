package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _1620_포켓몬 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s = br.readLine();
		
		st = new StringTokenizer(s);
		
		int N = Integer.parseInt(st.nextToken());
		int quiz = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> map= new HashMap<>();

		for(int i = 1; i < N+1; i++) {
			String pocketmon = br.readLine();
			String number = Integer.toString(i);
			
			map.put(number, pocketmon);
			map.put(pocketmon, number);
		}
		
	
		for(int i = 0; i < quiz; i++) {
			System.out.println(map.get(br.readLine()));
			
		}
		
	}
}
