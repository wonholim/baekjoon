import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		BigInteger a = new BigInteger(b, 2);
		BigInteger d = new BigInteger("17");
		a = a.multiply(d);
		String c = a.toString(2);
		System.out.println(c);

	}

}