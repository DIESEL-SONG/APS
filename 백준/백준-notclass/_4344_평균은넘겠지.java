import java.util.Scanner;

public class _4344_평균은넘겠지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		for(int i = 0; i < C; i++) {
			int N = sc.nextInt();
			int[] score = new int[N];
			double sum = 0;
			for(int j = 0; j < N; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			
			double avg = sum/N;
			
			double avgstudent = 0;
			double cnt = 0;
			for(int j = 0; j < N; j++) {
				if(score[j]>avg)
					cnt++;
			}
			
			System.out.printf("%.3f%%\n", (cnt/N)*100);
			
			
		}
	}
}
