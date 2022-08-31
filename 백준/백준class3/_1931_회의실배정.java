package class3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _1931_회의실배정 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] meeting = new int[N][2];
		
		//회의시간 배열에 담기
		for(int i = 0; i < N; i++) {
			meeting[i][0] = sc.nextInt(); //시작시간
			meeting[i][1] = sc.nextInt(); //종료시간
		}
		
		//시작시간을 기준으로 오름차순 정렬
		Arrays.sort(meeting, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0] - o2[0];
			}
		});
		
		
		//종료시간을 기준으로 오름차순 정렬
		Arrays.sort(meeting, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[1] - o2[1];
			}
		});
		
//		Arrays.sort(meeting, new Comparator<int[]>() {
//
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				if(o1[1] == o2[1]) {
//					return o1[0] - o2[0];
//				}
//				else
//					return o1[1] - o2[1];
//			}
//		});
		
		//cnt와 종료시간을 계산할 변수 초기화
		int cnt = 0;
		int ed = 0;
		
		//회의배열을 돌면서 시작시간이 종료시간보다 크거나 같으면 
		//종료시간을 그 회의의 종료시간으로 초기화한후,
		//cnt++
		//안겹치는 회의를 모두 카운드 할 수 있다.
		for(int i =0; i < N; i++) {
			if(meeting[i][0] >= ed) {
				ed = meeting[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}
