import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double b = sc.nextDouble();
		System.out.println(Math.round((180 - b) / 2 + b / 2));
	}

}
