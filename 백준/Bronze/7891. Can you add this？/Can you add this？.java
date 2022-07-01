import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			BigInteger z = sc.nextBigInteger();
			BigInteger x = sc.nextBigInteger();
			System.out.println(z.add(x));
		}
	}

}