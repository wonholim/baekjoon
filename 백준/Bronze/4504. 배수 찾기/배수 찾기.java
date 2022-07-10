import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		while(true) {
			int b = sc.nextInt();
			if(b == 0) {
				break;
			}
			if(b % a == 0) {
				System.out.println(b + " is a multiple of " + a + ".");
			}else {
				System.out.println(b + " is NOT a multiple of " + a + ".");
			}
		}
	}

}