import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if( a + d != 0 && b + c !=0) {
			if(a + d > b + c) {
				System.out.println(b + c);
			}else {
				System.out.println(a + d);
			}
		}else {
			System.out.println(0);
		}
	}

}