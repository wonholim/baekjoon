import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			for(int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < a; i++) {
			for(int j = a - 1; i < j; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}