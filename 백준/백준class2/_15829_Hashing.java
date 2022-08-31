package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _15829_Hashing {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 제한시간 1초.. 계속 곱하고 모듈러를 사용할거니까 일단 scan보다는 buffered를 써본다
		// 몇번을 해봐도 50점이 나온다..
		// 결국 구선생님한테 도움요청 했더니 long범위를 벗어나서 50점이라고한다
		// r을 곱하면서 바로 모듈러처리를 해주면 100점이 나올수있다고 한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		String str = br.readLine();

		// 최종 값을 담을 변수
		//int가 아니라 long
		long sum = 0;

		// 계속 제곱을 해줘야하므로 31의 0으로 시작하고
		// for문안에서 31을 곱해준다.
		double r = Math.pow(31, 0);

		// 모듈러의 값
		int m = 1234567891;
		for (int i = 0; i < num; i++) {
			sum += (str.charAt(i) - 'a' + 1) * r;
			r = (r * 31) % m;
		}
		bw.write(String.valueOf(sum % m));
		bw.flush();
	}
}
