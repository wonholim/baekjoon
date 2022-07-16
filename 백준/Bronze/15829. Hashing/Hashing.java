import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char[] b = new char[a];
		BigInteger sum = BigInteger.ZERO;
		String c = sc.next();
		for(int i = 0; i < a; i++) {
			b[i] = c.charAt(i);
			sum = sum.add(BigInteger.valueOf((b[i] - 96)).multiply(BigInteger.valueOf(31).pow(i)));
		}
		System.out.println(sum.remainder(BigInteger.valueOf(1234567891)));
	}

}
