import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print(a - (a * 22 / 100) + " ");
		System.out.print(a - (a - (a * 80 / 100)) * 22 / 100);
	}

}