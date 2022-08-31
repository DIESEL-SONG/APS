package class1;

import java.util.Scanner;

public class _2920_음계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] melody = new int[8];
		for(int i =0; i < 8; i++) {
			melody[i] = sc.nextInt();
		}
		
		int ans = 0;
		int cnta = 0;
		int cntd = 0;
		int cnt = 0;
		for(int i =0; i < 7; i++) {
			if(melody[i] == melody[i+1]-1) {
				cnta++;
			}
			else if(melody[i] == melody[i+1]+1) {
				cntd++;
			}
			else
				ans=3;
		}
		
		if(cnta == 7)
			ans = 1;
		else if(cntd == 7)
			ans = 2;
		
		if(ans == 1)
			System.out.println("ascending");
		else if(ans == 2)
			System.out.println("descending");
		else
			System.out.println("mixed");
		
	}
}

