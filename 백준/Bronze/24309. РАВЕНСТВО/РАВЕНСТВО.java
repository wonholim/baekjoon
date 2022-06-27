import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger c = sc.nextBigInteger();
		System.out.print((b.subtract(c)).divide(a));
	}

}