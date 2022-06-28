import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double avg = 0;
		double ex = 0;
		if(a > 0) {
			for(int i = 0; i < a; i++) {
				double b = sc.nextDouble();
				avg = avg + b;
				ex = ex + b / a;
			}
			avg = avg / a;
			System.out.printf("%.2f", avg / ex);
		}else {
			System.out.println("divide by zero");
		}
	}

}
