import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(b * b % c * c == 0) {
				System.out.println((b * b) / (c * c));
			}else {
				System.out.println(((b * b) / (c * c)) + 1);
			}
		}
	}

}
