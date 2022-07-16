import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if(a % b == 0) {
			System.out.println((int)(a / b));
		}else {
			System.out.println(a / b);
		}
	}

}
