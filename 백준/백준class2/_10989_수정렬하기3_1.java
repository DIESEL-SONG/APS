package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _10989_수정렬하기3_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//메모리초과 7%에서
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < N; i++) {
			bw.write(list.get(i)+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
