package class3;

import java.util.Scanner;

public class _1074_Z {
	static int N;
	static int r;
	static int c;
	static int size;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		r = sc.nextInt();
		c = sc.nextInt();
		
		size = (int) Math.pow(2, N);
		
		
	}
	
	public static int Z(int x, int y, int size) {
		if(size == 1) {
			return 0;
		}
		
		if(r < x + size /2&& c < y + size/2)
			return Z(x,y,size/2);
		
		else if (r < x + size / 2 && c < y + size)
			return Z(x, y + size / 2, size / 2) + (int) Math.pow(size / 2, 2);

		else if (r < x + size && c < y + size / 2)
			return Z(x + size / 2, y, size / 2) + (int) Math.pow(size / 2, 2) * 2;

		else
			return Z(x + size / 2, y + size / 2, size / 2) + (int) Math.pow(size / 2, 2) * 3;

	}
}
