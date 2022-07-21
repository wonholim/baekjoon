import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println((b * c) / gcd(b, c));
		}
	}

	private static int gcd(int b, int c) {
		// TODO Auto-generated method stub
		if(b % c == 0) return c;
		return gcd(c, b % c);
	}
}
