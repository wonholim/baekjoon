import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < a; i++) {
			String[] b = sc.nextLine().split(" ");
			int sum = 0;
			for(String k : b) {
				sum = sum + Integer.parseInt(k);
			}
			System.out.println(sum);
		}
	}

}
