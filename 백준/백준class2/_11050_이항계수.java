package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11050_이항계수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		System.out.println(fac(N) / (fac(N-K)*fac(K)));
		

	}
	
	//재귀함수이용
	static int fac(int N) {
		if(N <= 1) {
			return 1;
		}
		return N * fac(N-1);
	}
}
