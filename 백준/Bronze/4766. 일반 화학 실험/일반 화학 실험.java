import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double a = sc.nextDouble();
		double c = -11;
		while(true){
			double b = sc.nextDouble();
			if(b == 999) {
				break;
			}
			if(c == -11) {
				System.out.printf("%.2f\n", b - a);
			}else {
				System.out.printf("%.2f\n", b - c);
			}
			c = b;
		}
	}

}