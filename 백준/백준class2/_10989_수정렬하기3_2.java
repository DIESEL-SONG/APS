package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _10989_수정렬하기3_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//시간복잡도가 중요한 문제에서는 list를 사용해야하고
		//공간복잡도가 중요한 문제에서는 배열을 쓰는게 좋다!
		//list사용할경우 7%에서 메모리초과남.
		//똑같은 코드 배열을 사용하니까 통과
		
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		for(int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(nums);
		
		for(int i = 0; i < N; i++) {
			bw.write(nums[i]+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
