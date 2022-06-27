import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int j;
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			for(j = 1; j < a - i; j++) {
				System.out.print(" ");
			}
			for(int k = a; j -1 < k; k--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
