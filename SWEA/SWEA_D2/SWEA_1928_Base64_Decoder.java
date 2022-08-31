package SWEA_D2;

import java.io.BufferedReader;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Scanner;

public class SWEA_1928_Base64_Decoder {
	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		Decoder decoder = Base64.getDecoder();
		
		for(int tc = 1; tc <=T; tc++) {
			byte[] decodeBytes = decoder.decode(sc.next());
			String decodedString = new String(decodeBytes, "UTF-8");
			System.out.println("#" + tc + " " + decodedString);
		}
	}
}
