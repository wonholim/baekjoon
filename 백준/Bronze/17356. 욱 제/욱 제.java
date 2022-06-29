import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		double m = (B - A) / 400.0;
		double x = 1 /( 1 + Math.pow(10, m));
		System.out.println(x);
	}

}