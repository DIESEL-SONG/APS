import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon_1271_엄청난부자2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		ArrayList<Integer> arr = new ArrayList<>();
		String[] b = a.split(" ");
		
		int c = 0;
		
		for(int i = 0; i<b.length; i++) {
			try {
				c = Integer.parseInt(b[i]);
			}catch(Exception e) {
				arr.add(i);
			}
		}
			
		String[] tmp = new String[arr.size()];
		for (int i = 0; i < tmp.length ; i++) {
			tmp[i] = " ";
		} 
		
		
	
		}
		
	}



