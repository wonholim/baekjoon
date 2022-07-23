import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a --> 0) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			int gcd = gcd(b, c);
			int lcm = (b * c) / gcd;
			System.out.print(lcm + " " + gcd + "\n");
		}
	}

	private static int gcd(int b, int c) {
		// TODO Auto-generated method stub
		if(c == 0) return b;
		return gcd(c , b % c);
	}

}
