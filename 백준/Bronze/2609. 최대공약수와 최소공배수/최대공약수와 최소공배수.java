import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(gcd(a, b));
		System.out.println(lcm(a, b));
	}

	private static int lcm(int a, int b) {

		return (a * b) / gcd(a, b);
		// TODO Auto-generated method stub
		
	}

	private static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a % b);
		// TODO Auto-generated method stub
		
	}

}
