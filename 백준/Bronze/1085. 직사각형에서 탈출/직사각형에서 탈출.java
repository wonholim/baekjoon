import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int A = 0;
		int B = 0;
		A = Math.min(w-x, h-y);
		B = Math.min(x, y);
		System.out.println((int)(Math.min(A, B)));
	}

}