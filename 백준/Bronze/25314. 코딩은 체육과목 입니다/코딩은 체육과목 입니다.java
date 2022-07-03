import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a / 4; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}

}
