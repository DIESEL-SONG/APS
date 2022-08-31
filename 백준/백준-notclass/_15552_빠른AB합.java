import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _15552_빠른AB합 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			bw.write((A+B) + "\n");
//			bw.write(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken()) + "\n");
		}
		br.close();
		
		bw.flush();
		bw.close();
	}
}
