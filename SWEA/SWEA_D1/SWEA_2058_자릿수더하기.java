package SWEA_API_D1;

import java.util.Scanner;

public class SWEA_2058_자릿수더하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int num_th = num/1000;
		int num_hun = (num%1000) / 100;
		int num_ten = (num%100) / 10;
		int num_one = (num%10);
		
		int sum = num_th + num_hun + num_ten + num_one;
		
		System.out.println(sum);
	}
}
