package SWEA_API_D1;

public class SWEA_2027_대각선출력하기 {
	public static void main(String[] args) {
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print("+");
//			}
//			System.out.print("#");
//			for(int j=i; j<4;j++)
//				System.out.print("+");
//			System.out.println();
//		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=4;j++) {
				if(i==j)
					System.out.print("#");
				else
					System.out.print("+");
			}

			System.out.println();
		}
		
	}

}


