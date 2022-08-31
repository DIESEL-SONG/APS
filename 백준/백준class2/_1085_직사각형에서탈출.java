package class2;

import java.util.Scanner;

public class _1085_직사각형에서탈출 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		
		//x,y가 현재 한수의 위치
		//꼭지점의 시작은 0,0 끝은 w,h이니까
		//x-0, y-0, x-w, y-h의 절대값중 가장 작은 값을 조회하면 경계선까지 가는 최솟값이라고 생각했음.
		int min = Math.min(Math.min(Math.abs(x-0), Math.abs(y-0)), Math.min(Math.abs(x-w), Math.abs(y-h)));
		
		System.out.println(min);
	}
}
