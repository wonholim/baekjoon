import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a + b >= 2 * c) {
			System.out.println(a + b - 2 * c);
		}else {
			System.out.println(a + b);
		}
	}

}