import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			System.out.print(a * 6 + b * 3 + c * 2 + d * 1 + e * 2 + " ");
		}
	}

}
