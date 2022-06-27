import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int j;
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			for(j = 0; j < a - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}