import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		b = b + c;
		a = a + (b / 60);
		b = b % 60;
		if(a >= 24) {
			while(a >= 24) {
				a = a - 24;
			}
			System.out.println(a + " " + b);
		}else {
			System.out.println(a + " " + b);
		}
	}

}