import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 1; i < a + 1; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 2 * a - (2 * i - 1); 0 < k; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 2; i < a + 1; i++) {
			for(int j = a; i < j; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}