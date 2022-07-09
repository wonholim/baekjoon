import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 1, d = 1, e = 1;
		for(int i = 1; i <= a; i++) {
			c = c * i;
		}
		for(int i = 1; i <= b; i++) {
			d = d * i;
		}
		for(int i = 1; i <= a - b; i++) {
			e = e * i;
		}
		System.out.println(c / (d * e));
	}

}