package D3;

public class _3131_100만이하의모든소수 {
	public static void main(String[] args) {
		for(int i = 2; i < 1000000; i++) {
			int isprime = 0;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if( i % j == 0) {
					isprime = 1;
					break;
				}
			}
			if(isprime == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
