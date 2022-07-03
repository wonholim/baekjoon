import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.printf("%.10f", (100/a));
		System.out.println();
		System.out.printf("%.10f",100 / (100 - a));
	}

}
