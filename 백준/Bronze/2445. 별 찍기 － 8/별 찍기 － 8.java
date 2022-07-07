import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 1; i < a + 1; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for(int k = 2 * a - (2 * i - 1); 1 < k; k--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < a; i++) {
			for(int k = a; i < k; k--) {
				System.out.print("*");
			}
			for(int j = 1; j < 2 * i + 1; j++) {
				System.out.print(" ");
			}
			for(int k = a; i < k; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}