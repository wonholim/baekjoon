import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long e = sc.nextLong();
		long f = sc.nextLong();
		long g = sc.nextLong();
		System.out.println((e * f * g) * ((a * b) + (c * d)));
		sc.close();
	}

}
