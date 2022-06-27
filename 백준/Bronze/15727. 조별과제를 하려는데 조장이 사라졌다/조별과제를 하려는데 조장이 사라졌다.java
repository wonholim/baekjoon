import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a % 5 == 0) {
			System.out.println((a / 5));
		}else {
		System.out.println((a / 5) + 1);
		}
		sc.close();
	}

}
