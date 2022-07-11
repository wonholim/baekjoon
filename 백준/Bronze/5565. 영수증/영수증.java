import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int c = 0;
		for(int i = 0; i < 9; i++) {
			int b = sc.nextInt();
			c = c + b;
		}
		System.out.println(a - c);
	}
}