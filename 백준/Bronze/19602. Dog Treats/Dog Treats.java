import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		a = a + 2 * b + 3 * c;
		if(a >= 10) {
			System.out.println("happy");
		}else {
			System.out.println("sad");
		}
	}

}
