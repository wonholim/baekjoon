import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double[] e = new double[4];
		e[0] = a / c + b / d;
		e[1] = c / d + a / b;
		e[2] = d / b + c / a;
		e[3] = b / a + d / c;
		a = 0;
		for(int i = 0; i < 4; i++) {
			if(e[i] > a) {
				a = e[i];
			}
		}
		for(int i = 0; i < 4; i++) {
			if(e[i] == a) {
				System.out.println(i);
				break;
			}
		}
	}

}
