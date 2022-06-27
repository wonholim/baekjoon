import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger c = a.subtract(b);
		a = c.divide(BigInteger.valueOf(2)).add(b);
		b = c.divide(BigInteger.valueOf(2));;
		System.out.println(a);
		System.out.println(b);
	}

}