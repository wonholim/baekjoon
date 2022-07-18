import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			int b = sc.nextInt();
			double sum1 = 0;
			double sum2 = 0;
			for(int k = 0; k < b; k++) {
				double c = sc.nextDouble();
				double d = sc.nextDouble();
				sum1 = sum1 + c;
				sum2 = sum2 + (c * d);
			}
			System.out.print((int)sum1 + " ");
			System.out.printf("%.1f\n", (sum2 / sum1));
		}
	}

}
