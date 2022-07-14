import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		System.out.println(a.multiply(a.subtract(BigInteger.ONE)).multiply(a.subtract(BigInteger.TWO)).divide(BigInteger.valueOf(6)));
		System.out.println("3");
		}
}
