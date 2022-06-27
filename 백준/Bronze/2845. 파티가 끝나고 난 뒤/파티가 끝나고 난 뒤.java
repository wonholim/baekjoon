import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = 0; i < 5; i++) {
			int c = sc.nextInt();
			System.out.print(c - (a * b) + " ");
		}
	}

}