import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if((a * (100 - b) / 100) < 100) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
