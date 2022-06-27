import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int min;
		min = Math.min(a + d, a + e);
		min = Math.min(min, b + d);
		min = Math.min(min, b + e);
		min = Math.min(min, c + d);
		min = Math.min(min, c + e);
		System.out.println(min - 50);
	}

}