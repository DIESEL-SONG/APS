package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class _14928_큰수BIG {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String s = br.readLine();
		long temp = 0;
		for(int i =0; i < s.length(); i++) {
			temp = (temp*10 + (s.charAt(i)-'0')) % 20000303;
		}
		System.out.println(temp);
		
		
	}
}
